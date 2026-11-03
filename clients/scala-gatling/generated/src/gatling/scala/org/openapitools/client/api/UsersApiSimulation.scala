package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class UsersApiSimulation extends Simulation {

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
    val deleteUserPerSecond = config.getDouble("performance.operationsPerSecond.deleteUser") * rateMultiplier * instanceMultiplier
    val listUsersPerSecond = config.getDouble("performance.operationsPerSecond.listUsers") * rateMultiplier * instanceMultiplier
    val modifyUserPerSecond = config.getDouble("performance.operationsPerSecond.modifyUser") * rateMultiplier * instanceMultiplier
    val retrieveUserPerSecond = config.getDouble("performance.operationsPerSecond.retrieveUser") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val delete-userPATHFeeder = csv(userDataDirectory + File.separator + "deleteUser-pathParams.csv").random
    val list-usersQUERYFeeder = csv(userDataDirectory + File.separator + "listUsers-queryParams.csv").random
    val modify-userPATHFeeder = csv(userDataDirectory + File.separator + "modifyUser-pathParams.csv").random
    val retrieve-userPATHFeeder = csv(userDataDirectory + File.separator + "retrieveUser-pathParams.csv").random

    // Setup all scenarios

    
    val scndeleteUser = scenario("deleteUserSimulation")
        .feed(delete-userPATHFeeder)
        .exec(http("deleteUser")
        .httpRequest("DELETE","/organization/users/${user_id}")
)

    // Run scndeleteUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteUser.inject(
        rampUsersPerSec(1) to(deleteUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteUserPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistUsers = scenario("listUsersSimulation")
        .feed(list-usersQUERYFeeder)
        .exec(http("listUsers")
        .httpRequest("GET","/organization/users")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
)

    // Run scnlistUsers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistUsers.inject(
        rampUsersPerSec(1) to(listUsersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listUsersPerSecond) during(durationSeconds),
        rampUsersPerSec(listUsersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmodifyUser = scenario("modifyUserSimulation")
        .feed(modify-userPATHFeeder)
        .exec(http("modifyUser")
        .httpRequest("POST","/organization/users/${user_id}")
)

    // Run scnmodifyUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmodifyUser.inject(
        rampUsersPerSec(1) to(modifyUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(modifyUserPerSecond) during(durationSeconds),
        rampUsersPerSec(modifyUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnretrieveUser = scenario("retrieveUserSimulation")
        .feed(retrieve-userPATHFeeder)
        .exec(http("retrieveUser")
        .httpRequest("GET","/organization/users/${user_id}")
)

    // Run scnretrieveUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnretrieveUser.inject(
        rampUsersPerSec(1) to(retrieveUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(retrieveUserPerSecond) during(durationSeconds),
        rampUsersPerSec(retrieveUserPerSecond) to(1) during(rampDownSeconds)
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
