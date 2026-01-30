package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class VectorStoresApiSimulation extends Simulation {

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
    val cancelVectorStoreFileBatchPerSecond = config.getDouble("performance.operationsPerSecond.cancelVectorStoreFileBatch") * rateMultiplier * instanceMultiplier
    val createVectorStorePerSecond = config.getDouble("performance.operationsPerSecond.createVectorStore") * rateMultiplier * instanceMultiplier
    val createVectorStoreFilePerSecond = config.getDouble("performance.operationsPerSecond.createVectorStoreFile") * rateMultiplier * instanceMultiplier
    val createVectorStoreFileBatchPerSecond = config.getDouble("performance.operationsPerSecond.createVectorStoreFileBatch") * rateMultiplier * instanceMultiplier
    val deleteVectorStorePerSecond = config.getDouble("performance.operationsPerSecond.deleteVectorStore") * rateMultiplier * instanceMultiplier
    val deleteVectorStoreFilePerSecond = config.getDouble("performance.operationsPerSecond.deleteVectorStoreFile") * rateMultiplier * instanceMultiplier
    val getVectorStorePerSecond = config.getDouble("performance.operationsPerSecond.getVectorStore") * rateMultiplier * instanceMultiplier
    val getVectorStoreFilePerSecond = config.getDouble("performance.operationsPerSecond.getVectorStoreFile") * rateMultiplier * instanceMultiplier
    val getVectorStoreFileBatchPerSecond = config.getDouble("performance.operationsPerSecond.getVectorStoreFileBatch") * rateMultiplier * instanceMultiplier
    val listFilesInVectorStoreBatchPerSecond = config.getDouble("performance.operationsPerSecond.listFilesInVectorStoreBatch") * rateMultiplier * instanceMultiplier
    val listVectorStoreFilesPerSecond = config.getDouble("performance.operationsPerSecond.listVectorStoreFiles") * rateMultiplier * instanceMultiplier
    val listVectorStoresPerSecond = config.getDouble("performance.operationsPerSecond.listVectorStores") * rateMultiplier * instanceMultiplier
    val modifyVectorStorePerSecond = config.getDouble("performance.operationsPerSecond.modifyVectorStore") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val cancelVectorStoreFileBatchPATHFeeder = csv(userDataDirectory + File.separator + "cancelVectorStoreFileBatch-pathParams.csv").random
    val createVectorStoreFilePATHFeeder = csv(userDataDirectory + File.separator + "createVectorStoreFile-pathParams.csv").random
    val createVectorStoreFileBatchPATHFeeder = csv(userDataDirectory + File.separator + "createVectorStoreFileBatch-pathParams.csv").random
    val deleteVectorStorePATHFeeder = csv(userDataDirectory + File.separator + "deleteVectorStore-pathParams.csv").random
    val deleteVectorStoreFilePATHFeeder = csv(userDataDirectory + File.separator + "deleteVectorStoreFile-pathParams.csv").random
    val getVectorStorePATHFeeder = csv(userDataDirectory + File.separator + "getVectorStore-pathParams.csv").random
    val getVectorStoreFilePATHFeeder = csv(userDataDirectory + File.separator + "getVectorStoreFile-pathParams.csv").random
    val getVectorStoreFileBatchPATHFeeder = csv(userDataDirectory + File.separator + "getVectorStoreFileBatch-pathParams.csv").random
    val listFilesInVectorStoreBatchQUERYFeeder = csv(userDataDirectory + File.separator + "listFilesInVectorStoreBatch-queryParams.csv").random
    val listFilesInVectorStoreBatchPATHFeeder = csv(userDataDirectory + File.separator + "listFilesInVectorStoreBatch-pathParams.csv").random
    val listVectorStoreFilesQUERYFeeder = csv(userDataDirectory + File.separator + "listVectorStoreFiles-queryParams.csv").random
    val listVectorStoreFilesPATHFeeder = csv(userDataDirectory + File.separator + "listVectorStoreFiles-pathParams.csv").random
    val listVectorStoresQUERYFeeder = csv(userDataDirectory + File.separator + "listVectorStores-queryParams.csv").random
    val modifyVectorStorePATHFeeder = csv(userDataDirectory + File.separator + "modifyVectorStore-pathParams.csv").random

    // Setup all scenarios

    
    val scncancelVectorStoreFileBatch = scenario("cancelVectorStoreFileBatchSimulation")
        .feed(cancelVectorStoreFileBatchPATHFeeder)
        .exec(http("cancelVectorStoreFileBatch")
        .httpRequest("POST","/vector_stores/${vector_store_id}/file_batches/${batch_id}/cancel")
)

    // Run scncancelVectorStoreFileBatch with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncancelVectorStoreFileBatch.inject(
        rampUsersPerSec(1) to(cancelVectorStoreFileBatchPerSecond) during(rampUpSeconds),
        constantUsersPerSec(cancelVectorStoreFileBatchPerSecond) during(durationSeconds),
        rampUsersPerSec(cancelVectorStoreFileBatchPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateVectorStore = scenario("createVectorStoreSimulation")
        .exec(http("createVectorStore")
        .httpRequest("POST","/vector_stores")
)

    // Run scncreateVectorStore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateVectorStore.inject(
        rampUsersPerSec(1) to(createVectorStorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(createVectorStorePerSecond) during(durationSeconds),
        rampUsersPerSec(createVectorStorePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateVectorStoreFile = scenario("createVectorStoreFileSimulation")
        .feed(createVectorStoreFilePATHFeeder)
        .exec(http("createVectorStoreFile")
        .httpRequest("POST","/vector_stores/${vector_store_id}/files")
)

    // Run scncreateVectorStoreFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateVectorStoreFile.inject(
        rampUsersPerSec(1) to(createVectorStoreFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(createVectorStoreFilePerSecond) during(durationSeconds),
        rampUsersPerSec(createVectorStoreFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateVectorStoreFileBatch = scenario("createVectorStoreFileBatchSimulation")
        .feed(createVectorStoreFileBatchPATHFeeder)
        .exec(http("createVectorStoreFileBatch")
        .httpRequest("POST","/vector_stores/${vector_store_id}/file_batches")
)

    // Run scncreateVectorStoreFileBatch with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateVectorStoreFileBatch.inject(
        rampUsersPerSec(1) to(createVectorStoreFileBatchPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createVectorStoreFileBatchPerSecond) during(durationSeconds),
        rampUsersPerSec(createVectorStoreFileBatchPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteVectorStore = scenario("deleteVectorStoreSimulation")
        .feed(deleteVectorStorePATHFeeder)
        .exec(http("deleteVectorStore")
        .httpRequest("DELETE","/vector_stores/${vector_store_id}")
)

    // Run scndeleteVectorStore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteVectorStore.inject(
        rampUsersPerSec(1) to(deleteVectorStorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteVectorStorePerSecond) during(durationSeconds),
        rampUsersPerSec(deleteVectorStorePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteVectorStoreFile = scenario("deleteVectorStoreFileSimulation")
        .feed(deleteVectorStoreFilePATHFeeder)
        .exec(http("deleteVectorStoreFile")
        .httpRequest("DELETE","/vector_stores/${vector_store_id}/files/${file_id}")
)

    // Run scndeleteVectorStoreFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteVectorStoreFile.inject(
        rampUsersPerSec(1) to(deleteVectorStoreFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteVectorStoreFilePerSecond) during(durationSeconds),
        rampUsersPerSec(deleteVectorStoreFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetVectorStore = scenario("getVectorStoreSimulation")
        .feed(getVectorStorePATHFeeder)
        .exec(http("getVectorStore")
        .httpRequest("GET","/vector_stores/${vector_store_id}")
)

    // Run scngetVectorStore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetVectorStore.inject(
        rampUsersPerSec(1) to(getVectorStorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getVectorStorePerSecond) during(durationSeconds),
        rampUsersPerSec(getVectorStorePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetVectorStoreFile = scenario("getVectorStoreFileSimulation")
        .feed(getVectorStoreFilePATHFeeder)
        .exec(http("getVectorStoreFile")
        .httpRequest("GET","/vector_stores/${vector_store_id}/files/${file_id}")
)

    // Run scngetVectorStoreFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetVectorStoreFile.inject(
        rampUsersPerSec(1) to(getVectorStoreFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getVectorStoreFilePerSecond) during(durationSeconds),
        rampUsersPerSec(getVectorStoreFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetVectorStoreFileBatch = scenario("getVectorStoreFileBatchSimulation")
        .feed(getVectorStoreFileBatchPATHFeeder)
        .exec(http("getVectorStoreFileBatch")
        .httpRequest("GET","/vector_stores/${vector_store_id}/file_batches/${batch_id}")
)

    // Run scngetVectorStoreFileBatch with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetVectorStoreFileBatch.inject(
        rampUsersPerSec(1) to(getVectorStoreFileBatchPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getVectorStoreFileBatchPerSecond) during(durationSeconds),
        rampUsersPerSec(getVectorStoreFileBatchPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistFilesInVectorStoreBatch = scenario("listFilesInVectorStoreBatchSimulation")
        .feed(listFilesInVectorStoreBatchQUERYFeeder)
        .feed(listFilesInVectorStoreBatchPATHFeeder)
        .exec(http("listFilesInVectorStoreBatch")
        .httpRequest("GET","/vector_stores/${vector_store_id}/file_batches/${batch_id}/files")
        .queryParam("limit","${limit}")
        .queryParam("order","${order}")
        .queryParam("after","${after}")
        .queryParam("filter","${filter}")
        .queryParam("before","${before}")
)

    // Run scnlistFilesInVectorStoreBatch with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistFilesInVectorStoreBatch.inject(
        rampUsersPerSec(1) to(listFilesInVectorStoreBatchPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listFilesInVectorStoreBatchPerSecond) during(durationSeconds),
        rampUsersPerSec(listFilesInVectorStoreBatchPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistVectorStoreFiles = scenario("listVectorStoreFilesSimulation")
        .feed(listVectorStoreFilesQUERYFeeder)
        .feed(listVectorStoreFilesPATHFeeder)
        .exec(http("listVectorStoreFiles")
        .httpRequest("GET","/vector_stores/${vector_store_id}/files")
        .queryParam("limit","${limit}")
        .queryParam("order","${order}")
        .queryParam("after","${after}")
        .queryParam("filter","${filter}")
        .queryParam("before","${before}")
)

    // Run scnlistVectorStoreFiles with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistVectorStoreFiles.inject(
        rampUsersPerSec(1) to(listVectorStoreFilesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listVectorStoreFilesPerSecond) during(durationSeconds),
        rampUsersPerSec(listVectorStoreFilesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistVectorStores = scenario("listVectorStoresSimulation")
        .feed(listVectorStoresQUERYFeeder)
        .exec(http("listVectorStores")
        .httpRequest("GET","/vector_stores")
        .queryParam("limit","${limit}")
        .queryParam("order","${order}")
        .queryParam("after","${after}")
        .queryParam("before","${before}")
)

    // Run scnlistVectorStores with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistVectorStores.inject(
        rampUsersPerSec(1) to(listVectorStoresPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listVectorStoresPerSecond) during(durationSeconds),
        rampUsersPerSec(listVectorStoresPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmodifyVectorStore = scenario("modifyVectorStoreSimulation")
        .feed(modifyVectorStorePATHFeeder)
        .exec(http("modifyVectorStore")
        .httpRequest("POST","/vector_stores/${vector_store_id}")
)

    // Run scnmodifyVectorStore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmodifyVectorStore.inject(
        rampUsersPerSec(1) to(modifyVectorStorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(modifyVectorStorePerSecond) during(durationSeconds),
        rampUsersPerSec(modifyVectorStorePerSecond) to(1) during(rampDownSeconds)
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
