package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class InvitesApiSimulation extends Simulation {

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
    val deleteInvitePerSecond = config.getDouble("performance.operationsPerSecond.deleteInvite") * rateMultiplier * instanceMultiplier
    val inviteUserPerSecond = config.getDouble("performance.operationsPerSecond.inviteUser") * rateMultiplier * instanceMultiplier
    val listInvitesPerSecond = config.getDouble("performance.operationsPerSecond.listInvites") * rateMultiplier * instanceMultiplier
    val retrieveInvitePerSecond = config.getDouble("performance.operationsPerSecond.retrieveInvite") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val delete-invitePATHFeeder = csv(userDataDirectory + File.separator + "deleteInvite-pathParams.csv").random
    val list-invitesQUERYFeeder = csv(userDataDirectory + File.separator + "listInvites-queryParams.csv").random
    val retrieve-invitePATHFeeder = csv(userDataDirectory + File.separator + "retrieveInvite-pathParams.csv").random

    // Setup all scenarios

    
    val scndeleteInvite = scenario("deleteInviteSimulation")
        .feed(delete-invitePATHFeeder)
        .exec(http("deleteInvite")
        .httpRequest("DELETE","/organization/invites/${invite_id}")
)

    // Run scndeleteInvite with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteInvite.inject(
        rampUsersPerSec(1) to(deleteInvitePerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteInvitePerSecond) during(durationSeconds),
        rampUsersPerSec(deleteInvitePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scninviteUser = scenario("inviteUserSimulation")
        .exec(http("inviteUser")
        .httpRequest("POST","/organization/invites")
)

    // Run scninviteUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scninviteUser.inject(
        rampUsersPerSec(1) to(inviteUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(inviteUserPerSecond) during(durationSeconds),
        rampUsersPerSec(inviteUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistInvites = scenario("listInvitesSimulation")
        .feed(list-invitesQUERYFeeder)
        .exec(http("listInvites")
        .httpRequest("GET","/organization/invites")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
)

    // Run scnlistInvites with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistInvites.inject(
        rampUsersPerSec(1) to(listInvitesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listInvitesPerSecond) during(durationSeconds),
        rampUsersPerSec(listInvitesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnretrieveInvite = scenario("retrieveInviteSimulation")
        .feed(retrieve-invitePATHFeeder)
        .exec(http("retrieveInvite")
        .httpRequest("GET","/organization/invites/${invite_id}")
)

    // Run scnretrieveInvite with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnretrieveInvite.inject(
        rampUsersPerSec(1) to(retrieveInvitePerSecond) during(rampUpSeconds),
        constantUsersPerSec(retrieveInvitePerSecond) during(durationSeconds),
        rampUsersPerSec(retrieveInvitePerSecond) to(1) during(rampDownSeconds)
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
