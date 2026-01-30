package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class FilesApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("https://api.openai.com/v1")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val createFilePerSecond = config.getDouble("performance.operationsPerSecond.createFile") * rateMultiplier * instanceMultiplier
    val deleteFilePerSecond = config.getDouble("performance.operationsPerSecond.deleteFile") * rateMultiplier * instanceMultiplier
    val downloadFilePerSecond = config.getDouble("performance.operationsPerSecond.downloadFile") * rateMultiplier * instanceMultiplier
    val listFilesPerSecond = config.getDouble("performance.operationsPerSecond.listFiles") * rateMultiplier * instanceMultiplier
    val retrieveFilePerSecond = config.getDouble("performance.operationsPerSecond.retrieveFile") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val deleteFilePATHFeeder = csv(userDataDirectory + File.separator + "deleteFile-pathParams.csv").random
    val downloadFilePATHFeeder = csv(userDataDirectory + File.separator + "downloadFile-pathParams.csv").random
    val listFilesQUERYFeeder = csv(userDataDirectory + File.separator + "listFiles-queryParams.csv").random
    val retrieveFilePATHFeeder = csv(userDataDirectory + File.separator + "retrieveFile-pathParams.csv").random

    // Setup all scenarios

    
    val scncreateFile = scenario("createFileSimulation")
        .exec(http("createFile")
        .httpRequest("POST","/files")
)

    // Run scncreateFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateFile.inject(
        rampUsersPerSec(1) to(createFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(createFilePerSecond) during(durationSeconds),
        rampUsersPerSec(createFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteFile = scenario("deleteFileSimulation")
        .feed(deleteFilePATHFeeder)
        .exec(http("deleteFile")
        .httpRequest("DELETE","/files/${file_id}")
)

    // Run scndeleteFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteFile.inject(
        rampUsersPerSec(1) to(deleteFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteFilePerSecond) during(durationSeconds),
        rampUsersPerSec(deleteFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndownloadFile = scenario("downloadFileSimulation")
        .feed(downloadFilePATHFeeder)
        .exec(http("downloadFile")
        .httpRequest("GET","/files/${file_id}/content")
)

    // Run scndownloadFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndownloadFile.inject(
        rampUsersPerSec(1) to(downloadFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(downloadFilePerSecond) during(durationSeconds),
        rampUsersPerSec(downloadFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistFiles = scenario("listFilesSimulation")
        .feed(listFilesQUERYFeeder)
        .exec(http("listFiles")
        .httpRequest("GET","/files")
        .queryParam("order","${order}")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
        .queryParam("purpose","${purpose}")
)

    // Run scnlistFiles with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistFiles.inject(
        rampUsersPerSec(1) to(listFilesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listFilesPerSecond) during(durationSeconds),
        rampUsersPerSec(listFilesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnretrieveFile = scenario("retrieveFileSimulation")
        .feed(retrieveFilePATHFeeder)
        .exec(http("retrieveFile")
        .httpRequest("GET","/files/${file_id}")
)

    // Run scnretrieveFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnretrieveFile.inject(
        rampUsersPerSec(1) to(retrieveFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(retrieveFilePerSecond) during(durationSeconds),
        rampUsersPerSec(retrieveFilePerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
