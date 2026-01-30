package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class UsageApiSimulation extends Simulation {

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
    val usageAudioSpeechesPerSecond = config.getDouble("performance.operationsPerSecond.usageAudioSpeeches") * rateMultiplier * instanceMultiplier
    val usageAudioTranscriptionsPerSecond = config.getDouble("performance.operationsPerSecond.usageAudioTranscriptions") * rateMultiplier * instanceMultiplier
    val usageCodeInterpreterSessionsPerSecond = config.getDouble("performance.operationsPerSecond.usageCodeInterpreterSessions") * rateMultiplier * instanceMultiplier
    val usageCompletionsPerSecond = config.getDouble("performance.operationsPerSecond.usageCompletions") * rateMultiplier * instanceMultiplier
    val usageCostsPerSecond = config.getDouble("performance.operationsPerSecond.usageCosts") * rateMultiplier * instanceMultiplier
    val usageEmbeddingsPerSecond = config.getDouble("performance.operationsPerSecond.usageEmbeddings") * rateMultiplier * instanceMultiplier
    val usageImagesPerSecond = config.getDouble("performance.operationsPerSecond.usageImages") * rateMultiplier * instanceMultiplier
    val usageModerationsPerSecond = config.getDouble("performance.operationsPerSecond.usageModerations") * rateMultiplier * instanceMultiplier
    val usageVectorStoresPerSecond = config.getDouble("performance.operationsPerSecond.usageVectorStores") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val usage-audio-speechesQUERYFeeder = csv(userDataDirectory + File.separator + "usageAudioSpeeches-queryParams.csv").random
    val usage-audio-transcriptionsQUERYFeeder = csv(userDataDirectory + File.separator + "usageAudioTranscriptions-queryParams.csv").random
    val usage-code-interpreter-sessionsQUERYFeeder = csv(userDataDirectory + File.separator + "usageCodeInterpreterSessions-queryParams.csv").random
    val usage-completionsQUERYFeeder = csv(userDataDirectory + File.separator + "usageCompletions-queryParams.csv").random
    val usage-costsQUERYFeeder = csv(userDataDirectory + File.separator + "usageCosts-queryParams.csv").random
    val usage-embeddingsQUERYFeeder = csv(userDataDirectory + File.separator + "usageEmbeddings-queryParams.csv").random
    val usage-imagesQUERYFeeder = csv(userDataDirectory + File.separator + "usageImages-queryParams.csv").random
    val usage-moderationsQUERYFeeder = csv(userDataDirectory + File.separator + "usageModerations-queryParams.csv").random
    val usage-vector-storesQUERYFeeder = csv(userDataDirectory + File.separator + "usageVectorStores-queryParams.csv").random

    // Setup all scenarios

    
    val scnusageAudioSpeeches = scenario("usageAudioSpeechesSimulation")
        .feed(usage-audio-speechesQUERYFeeder)
        .exec(http("usageAudioSpeeches")
        .httpRequest("GET","/organization/usage/audio_speeches")
        .queryParam("page","${page}")
        .queryParam("start_time","${start_time}")
        .queryParam("group_by","${group_by}")
        .queryParam("limit","${limit}")
        .queryParam("project_ids","${project_ids}")
        .queryParam("bucket_width","${bucket_width}")
        .queryParam("models","${models}")
        .queryParam("api_key_ids","${api_key_ids}")
        .queryParam("user_ids","${user_ids}")
        .queryParam("end_time","${end_time}")
)

    // Run scnusageAudioSpeeches with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnusageAudioSpeeches.inject(
        rampUsersPerSec(1) to(usageAudioSpeechesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(usageAudioSpeechesPerSecond) during(durationSeconds),
        rampUsersPerSec(usageAudioSpeechesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnusageAudioTranscriptions = scenario("usageAudioTranscriptionsSimulation")
        .feed(usage-audio-transcriptionsQUERYFeeder)
        .exec(http("usageAudioTranscriptions")
        .httpRequest("GET","/organization/usage/audio_transcriptions")
        .queryParam("page","${page}")
        .queryParam("start_time","${start_time}")
        .queryParam("group_by","${group_by}")
        .queryParam("limit","${limit}")
        .queryParam("project_ids","${project_ids}")
        .queryParam("bucket_width","${bucket_width}")
        .queryParam("models","${models}")
        .queryParam("api_key_ids","${api_key_ids}")
        .queryParam("user_ids","${user_ids}")
        .queryParam("end_time","${end_time}")
)

    // Run scnusageAudioTranscriptions with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnusageAudioTranscriptions.inject(
        rampUsersPerSec(1) to(usageAudioTranscriptionsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(usageAudioTranscriptionsPerSecond) during(durationSeconds),
        rampUsersPerSec(usageAudioTranscriptionsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnusageCodeInterpreterSessions = scenario("usageCodeInterpreterSessionsSimulation")
        .feed(usage-code-interpreter-sessionsQUERYFeeder)
        .exec(http("usageCodeInterpreterSessions")
        .httpRequest("GET","/organization/usage/code_interpreter_sessions")
        .queryParam("group_by","${group_by}")
        .queryParam("page","${page}")
        .queryParam("start_time","${start_time}")
        .queryParam("limit","${limit}")
        .queryParam("project_ids","${project_ids}")
        .queryParam("bucket_width","${bucket_width}")
        .queryParam("end_time","${end_time}")
)

    // Run scnusageCodeInterpreterSessions with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnusageCodeInterpreterSessions.inject(
        rampUsersPerSec(1) to(usageCodeInterpreterSessionsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(usageCodeInterpreterSessionsPerSecond) during(durationSeconds),
        rampUsersPerSec(usageCodeInterpreterSessionsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnusageCompletions = scenario("usageCompletionsSimulation")
        .feed(usage-completionsQUERYFeeder)
        .exec(http("usageCompletions")
        .httpRequest("GET","/organization/usage/completions")
        .queryParam("page","${page}")
        .queryParam("start_time","${start_time}")
        .queryParam("limit","${limit}")
        .queryParam("project_ids","${project_ids}")
        .queryParam("bucket_width","${bucket_width}")
        .queryParam("models","${models}")
        .queryParam("api_key_ids","${api_key_ids}")
        .queryParam("user_ids","${user_ids}")
        .queryParam("batch","${batch}")
        .queryParam("group_by","${group_by}")
        .queryParam("end_time","${end_time}")
)

    // Run scnusageCompletions with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnusageCompletions.inject(
        rampUsersPerSec(1) to(usageCompletionsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(usageCompletionsPerSecond) during(durationSeconds),
        rampUsersPerSec(usageCompletionsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnusageCosts = scenario("usageCostsSimulation")
        .feed(usage-costsQUERYFeeder)
        .exec(http("usageCosts")
        .httpRequest("GET","/organization/costs")
        .queryParam("limit","${limit}")
        .queryParam("page","${page}")
        .queryParam("start_time","${start_time}")
        .queryParam("project_ids","${project_ids}")
        .queryParam("group_by","${group_by}")
        .queryParam("end_time","${end_time}")
        .queryParam("bucket_width","${bucket_width}")
)

    // Run scnusageCosts with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnusageCosts.inject(
        rampUsersPerSec(1) to(usageCostsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(usageCostsPerSecond) during(durationSeconds),
        rampUsersPerSec(usageCostsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnusageEmbeddings = scenario("usageEmbeddingsSimulation")
        .feed(usage-embeddingsQUERYFeeder)
        .exec(http("usageEmbeddings")
        .httpRequest("GET","/organization/usage/embeddings")
        .queryParam("page","${page}")
        .queryParam("start_time","${start_time}")
        .queryParam("group_by","${group_by}")
        .queryParam("limit","${limit}")
        .queryParam("project_ids","${project_ids}")
        .queryParam("bucket_width","${bucket_width}")
        .queryParam("models","${models}")
        .queryParam("api_key_ids","${api_key_ids}")
        .queryParam("user_ids","${user_ids}")
        .queryParam("end_time","${end_time}")
)

    // Run scnusageEmbeddings with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnusageEmbeddings.inject(
        rampUsersPerSec(1) to(usageEmbeddingsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(usageEmbeddingsPerSecond) during(durationSeconds),
        rampUsersPerSec(usageEmbeddingsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnusageImages = scenario("usageImagesSimulation")
        .feed(usage-imagesQUERYFeeder)
        .exec(http("usageImages")
        .httpRequest("GET","/organization/usage/images")
        .queryParam("sources","${sources}")
        .queryParam("page","${page}")
        .queryParam("start_time","${start_time}")
        .queryParam("limit","${limit}")
        .queryParam("project_ids","${project_ids}")
        .queryParam("bucket_width","${bucket_width}")
        .queryParam("models","${models}")
        .queryParam("sizes","${sizes}")
        .queryParam("group_by","${group_by}")
        .queryParam("api_key_ids","${api_key_ids}")
        .queryParam("user_ids","${user_ids}")
        .queryParam("end_time","${end_time}")
)

    // Run scnusageImages with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnusageImages.inject(
        rampUsersPerSec(1) to(usageImagesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(usageImagesPerSecond) during(durationSeconds),
        rampUsersPerSec(usageImagesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnusageModerations = scenario("usageModerationsSimulation")
        .feed(usage-moderationsQUERYFeeder)
        .exec(http("usageModerations")
        .httpRequest("GET","/organization/usage/moderations")
        .queryParam("page","${page}")
        .queryParam("start_time","${start_time}")
        .queryParam("group_by","${group_by}")
        .queryParam("limit","${limit}")
        .queryParam("project_ids","${project_ids}")
        .queryParam("bucket_width","${bucket_width}")
        .queryParam("models","${models}")
        .queryParam("api_key_ids","${api_key_ids}")
        .queryParam("user_ids","${user_ids}")
        .queryParam("end_time","${end_time}")
)

    // Run scnusageModerations with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnusageModerations.inject(
        rampUsersPerSec(1) to(usageModerationsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(usageModerationsPerSecond) during(durationSeconds),
        rampUsersPerSec(usageModerationsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnusageVectorStores = scenario("usageVectorStoresSimulation")
        .feed(usage-vector-storesQUERYFeeder)
        .exec(http("usageVectorStores")
        .httpRequest("GET","/organization/usage/vector_stores")
        .queryParam("group_by","${group_by}")
        .queryParam("page","${page}")
        .queryParam("start_time","${start_time}")
        .queryParam("limit","${limit}")
        .queryParam("project_ids","${project_ids}")
        .queryParam("bucket_width","${bucket_width}")
        .queryParam("end_time","${end_time}")
)

    // Run scnusageVectorStores with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnusageVectorStores.inject(
        rampUsersPerSec(1) to(usageVectorStoresPerSecond) during(rampUpSeconds),
        constantUsersPerSec(usageVectorStoresPerSecond) during(durationSeconds),
        rampUsersPerSec(usageVectorStoresPerSecond) to(1) during(rampDownSeconds)
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
