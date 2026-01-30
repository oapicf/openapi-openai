package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class FineTuningApiSimulation extends Simulation {

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
    val cancelFineTuningJobPerSecond = config.getDouble("performance.operationsPerSecond.cancelFineTuningJob") * rateMultiplier * instanceMultiplier
    val createFineTuningJobPerSecond = config.getDouble("performance.operationsPerSecond.createFineTuningJob") * rateMultiplier * instanceMultiplier
    val listFineTuningEventsPerSecond = config.getDouble("performance.operationsPerSecond.listFineTuningEvents") * rateMultiplier * instanceMultiplier
    val listFineTuningJobCheckpointsPerSecond = config.getDouble("performance.operationsPerSecond.listFineTuningJobCheckpoints") * rateMultiplier * instanceMultiplier
    val listPaginatedFineTuningJobsPerSecond = config.getDouble("performance.operationsPerSecond.listPaginatedFineTuningJobs") * rateMultiplier * instanceMultiplier
    val retrieveFineTuningJobPerSecond = config.getDouble("performance.operationsPerSecond.retrieveFineTuningJob") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val cancelFineTuningJobPATHFeeder = csv(userDataDirectory + File.separator + "cancelFineTuningJob-pathParams.csv").random
    val listFineTuningEventsQUERYFeeder = csv(userDataDirectory + File.separator + "listFineTuningEvents-queryParams.csv").random
    val listFineTuningEventsPATHFeeder = csv(userDataDirectory + File.separator + "listFineTuningEvents-pathParams.csv").random
    val listFineTuningJobCheckpointsQUERYFeeder = csv(userDataDirectory + File.separator + "listFineTuningJobCheckpoints-queryParams.csv").random
    val listFineTuningJobCheckpointsPATHFeeder = csv(userDataDirectory + File.separator + "listFineTuningJobCheckpoints-pathParams.csv").random
    val listPaginatedFineTuningJobsQUERYFeeder = csv(userDataDirectory + File.separator + "listPaginatedFineTuningJobs-queryParams.csv").random
    val retrieveFineTuningJobPATHFeeder = csv(userDataDirectory + File.separator + "retrieveFineTuningJob-pathParams.csv").random

    // Setup all scenarios

    
    val scncancelFineTuningJob = scenario("cancelFineTuningJobSimulation")
        .feed(cancelFineTuningJobPATHFeeder)
        .exec(http("cancelFineTuningJob")
        .httpRequest("POST","/fine_tuning/jobs/${fine_tuning_job_id}/cancel")
)

    // Run scncancelFineTuningJob with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncancelFineTuningJob.inject(
        rampUsersPerSec(1) to(cancelFineTuningJobPerSecond) during(rampUpSeconds),
        constantUsersPerSec(cancelFineTuningJobPerSecond) during(durationSeconds),
        rampUsersPerSec(cancelFineTuningJobPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateFineTuningJob = scenario("createFineTuningJobSimulation")
        .exec(http("createFineTuningJob")
        .httpRequest("POST","/fine_tuning/jobs")
)

    // Run scncreateFineTuningJob with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateFineTuningJob.inject(
        rampUsersPerSec(1) to(createFineTuningJobPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createFineTuningJobPerSecond) during(durationSeconds),
        rampUsersPerSec(createFineTuningJobPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistFineTuningEvents = scenario("listFineTuningEventsSimulation")
        .feed(listFineTuningEventsQUERYFeeder)
        .feed(listFineTuningEventsPATHFeeder)
        .exec(http("listFineTuningEvents")
        .httpRequest("GET","/fine_tuning/jobs/${fine_tuning_job_id}/events")
        .queryParam("after","${after}")
        .queryParam("limit","${limit}")
)

    // Run scnlistFineTuningEvents with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistFineTuningEvents.inject(
        rampUsersPerSec(1) to(listFineTuningEventsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listFineTuningEventsPerSecond) during(durationSeconds),
        rampUsersPerSec(listFineTuningEventsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistFineTuningJobCheckpoints = scenario("listFineTuningJobCheckpointsSimulation")
        .feed(listFineTuningJobCheckpointsQUERYFeeder)
        .feed(listFineTuningJobCheckpointsPATHFeeder)
        .exec(http("listFineTuningJobCheckpoints")
        .httpRequest("GET","/fine_tuning/jobs/${fine_tuning_job_id}/checkpoints")
        .queryParam("after","${after}")
        .queryParam("limit","${limit}")
)

    // Run scnlistFineTuningJobCheckpoints with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistFineTuningJobCheckpoints.inject(
        rampUsersPerSec(1) to(listFineTuningJobCheckpointsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listFineTuningJobCheckpointsPerSecond) during(durationSeconds),
        rampUsersPerSec(listFineTuningJobCheckpointsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistPaginatedFineTuningJobs = scenario("listPaginatedFineTuningJobsSimulation")
        .feed(listPaginatedFineTuningJobsQUERYFeeder)
        .exec(http("listPaginatedFineTuningJobs")
        .httpRequest("GET","/fine_tuning/jobs")
        .queryParam("after","${after}")
        .queryParam("limit","${limit}")
)

    // Run scnlistPaginatedFineTuningJobs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistPaginatedFineTuningJobs.inject(
        rampUsersPerSec(1) to(listPaginatedFineTuningJobsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listPaginatedFineTuningJobsPerSecond) during(durationSeconds),
        rampUsersPerSec(listPaginatedFineTuningJobsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnretrieveFineTuningJob = scenario("retrieveFineTuningJobSimulation")
        .feed(retrieveFineTuningJobPATHFeeder)
        .exec(http("retrieveFineTuningJob")
        .httpRequest("GET","/fine_tuning/jobs/${fine_tuning_job_id}")
)

    // Run scnretrieveFineTuningJob with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnretrieveFineTuningJob.inject(
        rampUsersPerSec(1) to(retrieveFineTuningJobPerSecond) during(rampUpSeconds),
        constantUsersPerSec(retrieveFineTuningJobPerSecond) during(durationSeconds),
        rampUsersPerSec(retrieveFineTuningJobPerSecond) to(1) during(rampDownSeconds)
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
