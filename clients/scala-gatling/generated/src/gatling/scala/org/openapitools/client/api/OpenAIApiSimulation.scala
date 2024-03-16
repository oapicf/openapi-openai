package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class OpenAIApiSimulation extends Simulation {

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
    val cancelFineTunePerSecond = config.getDouble("performance.operationsPerSecond.cancelFineTune") * rateMultiplier * instanceMultiplier
    val createChatCompletionPerSecond = config.getDouble("performance.operationsPerSecond.createChatCompletion") * rateMultiplier * instanceMultiplier
    val createCompletionPerSecond = config.getDouble("performance.operationsPerSecond.createCompletion") * rateMultiplier * instanceMultiplier
    val createEditPerSecond = config.getDouble("performance.operationsPerSecond.createEdit") * rateMultiplier * instanceMultiplier
    val createEmbeddingPerSecond = config.getDouble("performance.operationsPerSecond.createEmbedding") * rateMultiplier * instanceMultiplier
    val createFilePerSecond = config.getDouble("performance.operationsPerSecond.createFile") * rateMultiplier * instanceMultiplier
    val createFineTunePerSecond = config.getDouble("performance.operationsPerSecond.createFineTune") * rateMultiplier * instanceMultiplier
    val createImagePerSecond = config.getDouble("performance.operationsPerSecond.createImage") * rateMultiplier * instanceMultiplier
    val createImageEditPerSecond = config.getDouble("performance.operationsPerSecond.createImageEdit") * rateMultiplier * instanceMultiplier
    val createImageVariationPerSecond = config.getDouble("performance.operationsPerSecond.createImageVariation") * rateMultiplier * instanceMultiplier
    val createModerationPerSecond = config.getDouble("performance.operationsPerSecond.createModeration") * rateMultiplier * instanceMultiplier
    val createTranscriptionPerSecond = config.getDouble("performance.operationsPerSecond.createTranscription") * rateMultiplier * instanceMultiplier
    val createTranslationPerSecond = config.getDouble("performance.operationsPerSecond.createTranslation") * rateMultiplier * instanceMultiplier
    val deleteFilePerSecond = config.getDouble("performance.operationsPerSecond.deleteFile") * rateMultiplier * instanceMultiplier
    val deleteModelPerSecond = config.getDouble("performance.operationsPerSecond.deleteModel") * rateMultiplier * instanceMultiplier
    val downloadFilePerSecond = config.getDouble("performance.operationsPerSecond.downloadFile") * rateMultiplier * instanceMultiplier
    val listFilesPerSecond = config.getDouble("performance.operationsPerSecond.listFiles") * rateMultiplier * instanceMultiplier
    val listFineTuneEventsPerSecond = config.getDouble("performance.operationsPerSecond.listFineTuneEvents") * rateMultiplier * instanceMultiplier
    val listFineTunesPerSecond = config.getDouble("performance.operationsPerSecond.listFineTunes") * rateMultiplier * instanceMultiplier
    val listModelsPerSecond = config.getDouble("performance.operationsPerSecond.listModels") * rateMultiplier * instanceMultiplier
    val retrieveFilePerSecond = config.getDouble("performance.operationsPerSecond.retrieveFile") * rateMultiplier * instanceMultiplier
    val retrieveFineTunePerSecond = config.getDouble("performance.operationsPerSecond.retrieveFineTune") * rateMultiplier * instanceMultiplier
    val retrieveModelPerSecond = config.getDouble("performance.operationsPerSecond.retrieveModel") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val cancelFineTunePATHFeeder = csv(userDataDirectory + File.separator + "cancelFineTune-pathParams.csv").random
    val deleteFilePATHFeeder = csv(userDataDirectory + File.separator + "deleteFile-pathParams.csv").random
    val deleteModelPATHFeeder = csv(userDataDirectory + File.separator + "deleteModel-pathParams.csv").random
    val downloadFilePATHFeeder = csv(userDataDirectory + File.separator + "downloadFile-pathParams.csv").random
    val listFineTuneEventsQUERYFeeder = csv(userDataDirectory + File.separator + "listFineTuneEvents-queryParams.csv").random
    val listFineTuneEventsPATHFeeder = csv(userDataDirectory + File.separator + "listFineTuneEvents-pathParams.csv").random
    val retrieveFilePATHFeeder = csv(userDataDirectory + File.separator + "retrieveFile-pathParams.csv").random
    val retrieveFineTunePATHFeeder = csv(userDataDirectory + File.separator + "retrieveFineTune-pathParams.csv").random
    val retrieveModelPATHFeeder = csv(userDataDirectory + File.separator + "retrieveModel-pathParams.csv").random

    // Setup all scenarios

    
    val scncancelFineTune = scenario("cancelFineTuneSimulation")
        .feed(cancelFineTunePATHFeeder)
        .exec(http("cancelFineTune")
        .httpRequest("POST","/fine-tunes/${fine_tune_id}/cancel")
)

    // Run scncancelFineTune with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncancelFineTune.inject(
        rampUsersPerSec(1) to(cancelFineTunePerSecond) during(rampUpSeconds),
        constantUsersPerSec(cancelFineTunePerSecond) during(durationSeconds),
        rampUsersPerSec(cancelFineTunePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateChatCompletion = scenario("createChatCompletionSimulation")
        .exec(http("createChatCompletion")
        .httpRequest("POST","/chat/completions")
)

    // Run scncreateChatCompletion with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateChatCompletion.inject(
        rampUsersPerSec(1) to(createChatCompletionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createChatCompletionPerSecond) during(durationSeconds),
        rampUsersPerSec(createChatCompletionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateCompletion = scenario("createCompletionSimulation")
        .exec(http("createCompletion")
        .httpRequest("POST","/completions")
)

    // Run scncreateCompletion with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateCompletion.inject(
        rampUsersPerSec(1) to(createCompletionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createCompletionPerSecond) during(durationSeconds),
        rampUsersPerSec(createCompletionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateEdit = scenario("createEditSimulation")
        .exec(http("createEdit")
        .httpRequest("POST","/edits")
)

    // Run scncreateEdit with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateEdit.inject(
        rampUsersPerSec(1) to(createEditPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createEditPerSecond) during(durationSeconds),
        rampUsersPerSec(createEditPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateEmbedding = scenario("createEmbeddingSimulation")
        .exec(http("createEmbedding")
        .httpRequest("POST","/embeddings")
)

    // Run scncreateEmbedding with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateEmbedding.inject(
        rampUsersPerSec(1) to(createEmbeddingPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createEmbeddingPerSecond) during(durationSeconds),
        rampUsersPerSec(createEmbeddingPerSecond) to(1) during(rampDownSeconds)
    )

    
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

    
    val scncreateFineTune = scenario("createFineTuneSimulation")
        .exec(http("createFineTune")
        .httpRequest("POST","/fine-tunes")
)

    // Run scncreateFineTune with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateFineTune.inject(
        rampUsersPerSec(1) to(createFineTunePerSecond) during(rampUpSeconds),
        constantUsersPerSec(createFineTunePerSecond) during(durationSeconds),
        rampUsersPerSec(createFineTunePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateImage = scenario("createImageSimulation")
        .exec(http("createImage")
        .httpRequest("POST","/images/generations")
)

    // Run scncreateImage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateImage.inject(
        rampUsersPerSec(1) to(createImagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(createImagePerSecond) during(durationSeconds),
        rampUsersPerSec(createImagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateImageEdit = scenario("createImageEditSimulation")
        .exec(http("createImageEdit")
        .httpRequest("POST","/images/edits")
)

    // Run scncreateImageEdit with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateImageEdit.inject(
        rampUsersPerSec(1) to(createImageEditPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createImageEditPerSecond) during(durationSeconds),
        rampUsersPerSec(createImageEditPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateImageVariation = scenario("createImageVariationSimulation")
        .exec(http("createImageVariation")
        .httpRequest("POST","/images/variations")
)

    // Run scncreateImageVariation with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateImageVariation.inject(
        rampUsersPerSec(1) to(createImageVariationPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createImageVariationPerSecond) during(durationSeconds),
        rampUsersPerSec(createImageVariationPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateModeration = scenario("createModerationSimulation")
        .exec(http("createModeration")
        .httpRequest("POST","/moderations")
)

    // Run scncreateModeration with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateModeration.inject(
        rampUsersPerSec(1) to(createModerationPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createModerationPerSecond) during(durationSeconds),
        rampUsersPerSec(createModerationPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateTranscription = scenario("createTranscriptionSimulation")
        .exec(http("createTranscription")
        .httpRequest("POST","/audio/transcriptions")
)

    // Run scncreateTranscription with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateTranscription.inject(
        rampUsersPerSec(1) to(createTranscriptionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createTranscriptionPerSecond) during(durationSeconds),
        rampUsersPerSec(createTranscriptionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateTranslation = scenario("createTranslationSimulation")
        .exec(http("createTranslation")
        .httpRequest("POST","/audio/translations")
)

    // Run scncreateTranslation with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateTranslation.inject(
        rampUsersPerSec(1) to(createTranslationPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createTranslationPerSecond) during(durationSeconds),
        rampUsersPerSec(createTranslationPerSecond) to(1) during(rampDownSeconds)
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

    
    val scndeleteModel = scenario("deleteModelSimulation")
        .feed(deleteModelPATHFeeder)
        .exec(http("deleteModel")
        .httpRequest("DELETE","/models/${model}")
)

    // Run scndeleteModel with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteModel.inject(
        rampUsersPerSec(1) to(deleteModelPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteModelPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteModelPerSecond) to(1) during(rampDownSeconds)
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
        .exec(http("listFiles")
        .httpRequest("GET","/files")
)

    // Run scnlistFiles with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistFiles.inject(
        rampUsersPerSec(1) to(listFilesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listFilesPerSecond) during(durationSeconds),
        rampUsersPerSec(listFilesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistFineTuneEvents = scenario("listFineTuneEventsSimulation")
        .feed(listFineTuneEventsQUERYFeeder)
        .feed(listFineTuneEventsPATHFeeder)
        .exec(http("listFineTuneEvents")
        .httpRequest("GET","/fine-tunes/${fine_tune_id}/events")
        .queryParam("stream","${stream}")
)

    // Run scnlistFineTuneEvents with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistFineTuneEvents.inject(
        rampUsersPerSec(1) to(listFineTuneEventsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listFineTuneEventsPerSecond) during(durationSeconds),
        rampUsersPerSec(listFineTuneEventsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistFineTunes = scenario("listFineTunesSimulation")
        .exec(http("listFineTunes")
        .httpRequest("GET","/fine-tunes")
)

    // Run scnlistFineTunes with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistFineTunes.inject(
        rampUsersPerSec(1) to(listFineTunesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listFineTunesPerSecond) during(durationSeconds),
        rampUsersPerSec(listFineTunesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistModels = scenario("listModelsSimulation")
        .exec(http("listModels")
        .httpRequest("GET","/models")
)

    // Run scnlistModels with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistModels.inject(
        rampUsersPerSec(1) to(listModelsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listModelsPerSecond) during(durationSeconds),
        rampUsersPerSec(listModelsPerSecond) to(1) during(rampDownSeconds)
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

    
    val scnretrieveFineTune = scenario("retrieveFineTuneSimulation")
        .feed(retrieveFineTunePATHFeeder)
        .exec(http("retrieveFineTune")
        .httpRequest("GET","/fine-tunes/${fine_tune_id}")
)

    // Run scnretrieveFineTune with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnretrieveFineTune.inject(
        rampUsersPerSec(1) to(retrieveFineTunePerSecond) during(rampUpSeconds),
        constantUsersPerSec(retrieveFineTunePerSecond) during(durationSeconds),
        rampUsersPerSec(retrieveFineTunePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnretrieveModel = scenario("retrieveModelSimulation")
        .feed(retrieveModelPATHFeeder)
        .exec(http("retrieveModel")
        .httpRequest("GET","/models/${model}")
)

    // Run scnretrieveModel with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnretrieveModel.inject(
        rampUsersPerSec(1) to(retrieveModelPerSecond) during(rampUpSeconds),
        constantUsersPerSec(retrieveModelPerSecond) during(durationSeconds),
        rampUsersPerSec(retrieveModelPerSecond) to(1) during(rampDownSeconds)
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
