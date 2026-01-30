package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class DefaultApiSimulation extends Simulation {

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
    val adminApiKeysCreatePerSecond = config.getDouble("performance.operationsPerSecond.adminApiKeysCreate") * rateMultiplier * instanceMultiplier
    val adminApiKeysDeletePerSecond = config.getDouble("performance.operationsPerSecond.adminApiKeysDelete") * rateMultiplier * instanceMultiplier
    val adminApiKeysGetPerSecond = config.getDouble("performance.operationsPerSecond.adminApiKeysGet") * rateMultiplier * instanceMultiplier
    val adminApiKeysListPerSecond = config.getDouble("performance.operationsPerSecond.adminApiKeysList") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val admin-api-keys-deletePATHFeeder = csv(userDataDirectory + File.separator + "adminApiKeysDelete-pathParams.csv").random
    val admin-api-keys-getPATHFeeder = csv(userDataDirectory + File.separator + "adminApiKeysGet-pathParams.csv").random
    val admin-api-keys-listQUERYFeeder = csv(userDataDirectory + File.separator + "adminApiKeysList-queryParams.csv").random

    // Setup all scenarios

    
    val scnadminApiKeysCreate = scenario("adminApiKeysCreateSimulation")
        .exec(http("adminApiKeysCreate")
        .httpRequest("POST","/organization/admin_api_keys")
)

    // Run scnadminApiKeysCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadminApiKeysCreate.inject(
        rampUsersPerSec(1) to(adminApiKeysCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(adminApiKeysCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(adminApiKeysCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadminApiKeysDelete = scenario("adminApiKeysDeleteSimulation")
        .feed(admin-api-keys-deletePATHFeeder)
        .exec(http("adminApiKeysDelete")
        .httpRequest("DELETE","/organization/admin_api_keys/${key_id}")
)

    // Run scnadminApiKeysDelete with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadminApiKeysDelete.inject(
        rampUsersPerSec(1) to(adminApiKeysDeletePerSecond) during(rampUpSeconds),
        constantUsersPerSec(adminApiKeysDeletePerSecond) during(durationSeconds),
        rampUsersPerSec(adminApiKeysDeletePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadminApiKeysGet = scenario("adminApiKeysGetSimulation")
        .feed(admin-api-keys-getPATHFeeder)
        .exec(http("adminApiKeysGet")
        .httpRequest("GET","/organization/admin_api_keys/${key_id}")
)

    // Run scnadminApiKeysGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadminApiKeysGet.inject(
        rampUsersPerSec(1) to(adminApiKeysGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adminApiKeysGetPerSecond) during(durationSeconds),
        rampUsersPerSec(adminApiKeysGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnadminApiKeysList = scenario("adminApiKeysListSimulation")
        .feed(admin-api-keys-listQUERYFeeder)
        .exec(http("adminApiKeysList")
        .httpRequest("GET","/organization/admin_api_keys")
        .queryParam("limit","${limit}")
        .queryParam("order","${order}")
        .queryParam("after","${after}")
)

    // Run scnadminApiKeysList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadminApiKeysList.inject(
        rampUsersPerSec(1) to(adminApiKeysListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(adminApiKeysListPerSecond) during(durationSeconds),
        rampUsersPerSec(adminApiKeysListPerSecond) to(1) during(rampDownSeconds)
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
