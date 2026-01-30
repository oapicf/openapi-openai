package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class UploadsApiSimulation extends Simulation {

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
    val addUploadPartPerSecond = config.getDouble("performance.operationsPerSecond.addUploadPart") * rateMultiplier * instanceMultiplier
    val cancelUploadPerSecond = config.getDouble("performance.operationsPerSecond.cancelUpload") * rateMultiplier * instanceMultiplier
    val completeUploadPerSecond = config.getDouble("performance.operationsPerSecond.completeUpload") * rateMultiplier * instanceMultiplier
    val createUploadPerSecond = config.getDouble("performance.operationsPerSecond.createUpload") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val addUploadPartPATHFeeder = csv(userDataDirectory + File.separator + "addUploadPart-pathParams.csv").random
    val cancelUploadPATHFeeder = csv(userDataDirectory + File.separator + "cancelUpload-pathParams.csv").random
    val completeUploadPATHFeeder = csv(userDataDirectory + File.separator + "completeUpload-pathParams.csv").random

    // Setup all scenarios

    
    val scnaddUploadPart = scenario("addUploadPartSimulation")
        .feed(addUploadPartPATHFeeder)
        .exec(http("addUploadPart")
        .httpRequest("POST","/uploads/${upload_id}/parts")
)

    // Run scnaddUploadPart with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaddUploadPart.inject(
        rampUsersPerSec(1) to(addUploadPartPerSecond) during(rampUpSeconds),
        constantUsersPerSec(addUploadPartPerSecond) during(durationSeconds),
        rampUsersPerSec(addUploadPartPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncancelUpload = scenario("cancelUploadSimulation")
        .feed(cancelUploadPATHFeeder)
        .exec(http("cancelUpload")
        .httpRequest("POST","/uploads/${upload_id}/cancel")
)

    // Run scncancelUpload with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncancelUpload.inject(
        rampUsersPerSec(1) to(cancelUploadPerSecond) during(rampUpSeconds),
        constantUsersPerSec(cancelUploadPerSecond) during(durationSeconds),
        rampUsersPerSec(cancelUploadPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncompleteUpload = scenario("completeUploadSimulation")
        .feed(completeUploadPATHFeeder)
        .exec(http("completeUpload")
        .httpRequest("POST","/uploads/${upload_id}/complete")
)

    // Run scncompleteUpload with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncompleteUpload.inject(
        rampUsersPerSec(1) to(completeUploadPerSecond) during(rampUpSeconds),
        constantUsersPerSec(completeUploadPerSecond) during(durationSeconds),
        rampUsersPerSec(completeUploadPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateUpload = scenario("createUploadSimulation")
        .exec(http("createUpload")
        .httpRequest("POST","/uploads")
)

    // Run scncreateUpload with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateUpload.inject(
        rampUsersPerSec(1) to(createUploadPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createUploadPerSecond) during(durationSeconds),
        rampUsersPerSec(createUploadPerSecond) to(1) during(rampDownSeconds)
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
