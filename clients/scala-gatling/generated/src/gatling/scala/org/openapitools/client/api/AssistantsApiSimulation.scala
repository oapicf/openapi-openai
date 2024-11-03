package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class AssistantsApiSimulation extends Simulation {

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
    val cancelRunPerSecond = config.getDouble("performance.operationsPerSecond.cancelRun") * rateMultiplier * instanceMultiplier
    val createAssistantPerSecond = config.getDouble("performance.operationsPerSecond.createAssistant") * rateMultiplier * instanceMultiplier
    val createAssistantFilePerSecond = config.getDouble("performance.operationsPerSecond.createAssistantFile") * rateMultiplier * instanceMultiplier
    val createMessagePerSecond = config.getDouble("performance.operationsPerSecond.createMessage") * rateMultiplier * instanceMultiplier
    val createRunPerSecond = config.getDouble("performance.operationsPerSecond.createRun") * rateMultiplier * instanceMultiplier
    val createThreadPerSecond = config.getDouble("performance.operationsPerSecond.createThread") * rateMultiplier * instanceMultiplier
    val createThreadAndRunPerSecond = config.getDouble("performance.operationsPerSecond.createThreadAndRun") * rateMultiplier * instanceMultiplier
    val deleteAssistantPerSecond = config.getDouble("performance.operationsPerSecond.deleteAssistant") * rateMultiplier * instanceMultiplier
    val deleteAssistantFilePerSecond = config.getDouble("performance.operationsPerSecond.deleteAssistantFile") * rateMultiplier * instanceMultiplier
    val deleteThreadPerSecond = config.getDouble("performance.operationsPerSecond.deleteThread") * rateMultiplier * instanceMultiplier
    val getAssistantPerSecond = config.getDouble("performance.operationsPerSecond.getAssistant") * rateMultiplier * instanceMultiplier
    val getAssistantFilePerSecond = config.getDouble("performance.operationsPerSecond.getAssistantFile") * rateMultiplier * instanceMultiplier
    val getMessagePerSecond = config.getDouble("performance.operationsPerSecond.getMessage") * rateMultiplier * instanceMultiplier
    val getMessageFilePerSecond = config.getDouble("performance.operationsPerSecond.getMessageFile") * rateMultiplier * instanceMultiplier
    val getRunPerSecond = config.getDouble("performance.operationsPerSecond.getRun") * rateMultiplier * instanceMultiplier
    val getRunStepPerSecond = config.getDouble("performance.operationsPerSecond.getRunStep") * rateMultiplier * instanceMultiplier
    val getThreadPerSecond = config.getDouble("performance.operationsPerSecond.getThread") * rateMultiplier * instanceMultiplier
    val listAssistantFilesPerSecond = config.getDouble("performance.operationsPerSecond.listAssistantFiles") * rateMultiplier * instanceMultiplier
    val listAssistantsPerSecond = config.getDouble("performance.operationsPerSecond.listAssistants") * rateMultiplier * instanceMultiplier
    val listMessageFilesPerSecond = config.getDouble("performance.operationsPerSecond.listMessageFiles") * rateMultiplier * instanceMultiplier
    val listMessagesPerSecond = config.getDouble("performance.operationsPerSecond.listMessages") * rateMultiplier * instanceMultiplier
    val listRunStepsPerSecond = config.getDouble("performance.operationsPerSecond.listRunSteps") * rateMultiplier * instanceMultiplier
    val listRunsPerSecond = config.getDouble("performance.operationsPerSecond.listRuns") * rateMultiplier * instanceMultiplier
    val modifyAssistantPerSecond = config.getDouble("performance.operationsPerSecond.modifyAssistant") * rateMultiplier * instanceMultiplier
    val modifyMessagePerSecond = config.getDouble("performance.operationsPerSecond.modifyMessage") * rateMultiplier * instanceMultiplier
    val modifyRunPerSecond = config.getDouble("performance.operationsPerSecond.modifyRun") * rateMultiplier * instanceMultiplier
    val modifyThreadPerSecond = config.getDouble("performance.operationsPerSecond.modifyThread") * rateMultiplier * instanceMultiplier
    val submitToolOuputsToRunPerSecond = config.getDouble("performance.operationsPerSecond.submitToolOuputsToRun") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val cancelRunPATHFeeder = csv(userDataDirectory + File.separator + "cancelRun-pathParams.csv").random
    val createAssistantFilePATHFeeder = csv(userDataDirectory + File.separator + "createAssistantFile-pathParams.csv").random
    val createMessagePATHFeeder = csv(userDataDirectory + File.separator + "createMessage-pathParams.csv").random
    val createRunPATHFeeder = csv(userDataDirectory + File.separator + "createRun-pathParams.csv").random
    val deleteAssistantPATHFeeder = csv(userDataDirectory + File.separator + "deleteAssistant-pathParams.csv").random
    val deleteAssistantFilePATHFeeder = csv(userDataDirectory + File.separator + "deleteAssistantFile-pathParams.csv").random
    val deleteThreadPATHFeeder = csv(userDataDirectory + File.separator + "deleteThread-pathParams.csv").random
    val getAssistantPATHFeeder = csv(userDataDirectory + File.separator + "getAssistant-pathParams.csv").random
    val getAssistantFilePATHFeeder = csv(userDataDirectory + File.separator + "getAssistantFile-pathParams.csv").random
    val getMessagePATHFeeder = csv(userDataDirectory + File.separator + "getMessage-pathParams.csv").random
    val getMessageFilePATHFeeder = csv(userDataDirectory + File.separator + "getMessageFile-pathParams.csv").random
    val getRunPATHFeeder = csv(userDataDirectory + File.separator + "getRun-pathParams.csv").random
    val getRunStepPATHFeeder = csv(userDataDirectory + File.separator + "getRunStep-pathParams.csv").random
    val getThreadPATHFeeder = csv(userDataDirectory + File.separator + "getThread-pathParams.csv").random
    val listAssistantFilesQUERYFeeder = csv(userDataDirectory + File.separator + "listAssistantFiles-queryParams.csv").random
    val listAssistantFilesPATHFeeder = csv(userDataDirectory + File.separator + "listAssistantFiles-pathParams.csv").random
    val listAssistantsQUERYFeeder = csv(userDataDirectory + File.separator + "listAssistants-queryParams.csv").random
    val listMessageFilesQUERYFeeder = csv(userDataDirectory + File.separator + "listMessageFiles-queryParams.csv").random
    val listMessageFilesPATHFeeder = csv(userDataDirectory + File.separator + "listMessageFiles-pathParams.csv").random
    val listMessagesQUERYFeeder = csv(userDataDirectory + File.separator + "listMessages-queryParams.csv").random
    val listMessagesPATHFeeder = csv(userDataDirectory + File.separator + "listMessages-pathParams.csv").random
    val listRunStepsQUERYFeeder = csv(userDataDirectory + File.separator + "listRunSteps-queryParams.csv").random
    val listRunStepsPATHFeeder = csv(userDataDirectory + File.separator + "listRunSteps-pathParams.csv").random
    val listRunsQUERYFeeder = csv(userDataDirectory + File.separator + "listRuns-queryParams.csv").random
    val listRunsPATHFeeder = csv(userDataDirectory + File.separator + "listRuns-pathParams.csv").random
    val modifyAssistantPATHFeeder = csv(userDataDirectory + File.separator + "modifyAssistant-pathParams.csv").random
    val modifyMessagePATHFeeder = csv(userDataDirectory + File.separator + "modifyMessage-pathParams.csv").random
    val modifyRunPATHFeeder = csv(userDataDirectory + File.separator + "modifyRun-pathParams.csv").random
    val modifyThreadPATHFeeder = csv(userDataDirectory + File.separator + "modifyThread-pathParams.csv").random
    val submitToolOuputsToRunPATHFeeder = csv(userDataDirectory + File.separator + "submitToolOuputsToRun-pathParams.csv").random

    // Setup all scenarios

    
    val scncancelRun = scenario("cancelRunSimulation")
        .feed(cancelRunPATHFeeder)
        .exec(http("cancelRun")
        .httpRequest("POST","/threads/${thread_id}/runs/${run_id}/cancel")
)

    // Run scncancelRun with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncancelRun.inject(
        rampUsersPerSec(1) to(cancelRunPerSecond) during(rampUpSeconds),
        constantUsersPerSec(cancelRunPerSecond) during(durationSeconds),
        rampUsersPerSec(cancelRunPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateAssistant = scenario("createAssistantSimulation")
        .exec(http("createAssistant")
        .httpRequest("POST","/assistants")
)

    // Run scncreateAssistant with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateAssistant.inject(
        rampUsersPerSec(1) to(createAssistantPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createAssistantPerSecond) during(durationSeconds),
        rampUsersPerSec(createAssistantPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateAssistantFile = scenario("createAssistantFileSimulation")
        .feed(createAssistantFilePATHFeeder)
        .exec(http("createAssistantFile")
        .httpRequest("POST","/assistants/${assistant_id}/files")
)

    // Run scncreateAssistantFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateAssistantFile.inject(
        rampUsersPerSec(1) to(createAssistantFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(createAssistantFilePerSecond) during(durationSeconds),
        rampUsersPerSec(createAssistantFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateMessage = scenario("createMessageSimulation")
        .feed(createMessagePATHFeeder)
        .exec(http("createMessage")
        .httpRequest("POST","/threads/${thread_id}/messages")
)

    // Run scncreateMessage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateMessage.inject(
        rampUsersPerSec(1) to(createMessagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(createMessagePerSecond) during(durationSeconds),
        rampUsersPerSec(createMessagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateRun = scenario("createRunSimulation")
        .feed(createRunPATHFeeder)
        .exec(http("createRun")
        .httpRequest("POST","/threads/${thread_id}/runs")
)

    // Run scncreateRun with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateRun.inject(
        rampUsersPerSec(1) to(createRunPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createRunPerSecond) during(durationSeconds),
        rampUsersPerSec(createRunPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateThread = scenario("createThreadSimulation")
        .exec(http("createThread")
        .httpRequest("POST","/threads")
)

    // Run scncreateThread with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateThread.inject(
        rampUsersPerSec(1) to(createThreadPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createThreadPerSecond) during(durationSeconds),
        rampUsersPerSec(createThreadPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateThreadAndRun = scenario("createThreadAndRunSimulation")
        .exec(http("createThreadAndRun")
        .httpRequest("POST","/threads/runs")
)

    // Run scncreateThreadAndRun with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateThreadAndRun.inject(
        rampUsersPerSec(1) to(createThreadAndRunPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createThreadAndRunPerSecond) during(durationSeconds),
        rampUsersPerSec(createThreadAndRunPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteAssistant = scenario("deleteAssistantSimulation")
        .feed(deleteAssistantPATHFeeder)
        .exec(http("deleteAssistant")
        .httpRequest("DELETE","/assistants/${assistant_id}")
)

    // Run scndeleteAssistant with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteAssistant.inject(
        rampUsersPerSec(1) to(deleteAssistantPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteAssistantPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteAssistantPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteAssistantFile = scenario("deleteAssistantFileSimulation")
        .feed(deleteAssistantFilePATHFeeder)
        .exec(http("deleteAssistantFile")
        .httpRequest("DELETE","/assistants/${assistant_id}/files/${file_id}")
)

    // Run scndeleteAssistantFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteAssistantFile.inject(
        rampUsersPerSec(1) to(deleteAssistantFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteAssistantFilePerSecond) during(durationSeconds),
        rampUsersPerSec(deleteAssistantFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteThread = scenario("deleteThreadSimulation")
        .feed(deleteThreadPATHFeeder)
        .exec(http("deleteThread")
        .httpRequest("DELETE","/threads/${thread_id}")
)

    // Run scndeleteThread with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteThread.inject(
        rampUsersPerSec(1) to(deleteThreadPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteThreadPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteThreadPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAssistant = scenario("getAssistantSimulation")
        .feed(getAssistantPATHFeeder)
        .exec(http("getAssistant")
        .httpRequest("GET","/assistants/${assistant_id}")
)

    // Run scngetAssistant with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAssistant.inject(
        rampUsersPerSec(1) to(getAssistantPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAssistantPerSecond) during(durationSeconds),
        rampUsersPerSec(getAssistantPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAssistantFile = scenario("getAssistantFileSimulation")
        .feed(getAssistantFilePATHFeeder)
        .exec(http("getAssistantFile")
        .httpRequest("GET","/assistants/${assistant_id}/files/${file_id}")
)

    // Run scngetAssistantFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAssistantFile.inject(
        rampUsersPerSec(1) to(getAssistantFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAssistantFilePerSecond) during(durationSeconds),
        rampUsersPerSec(getAssistantFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetMessage = scenario("getMessageSimulation")
        .feed(getMessagePATHFeeder)
        .exec(http("getMessage")
        .httpRequest("GET","/threads/${thread_id}/messages/${message_id}")
)

    // Run scngetMessage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetMessage.inject(
        rampUsersPerSec(1) to(getMessagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getMessagePerSecond) during(durationSeconds),
        rampUsersPerSec(getMessagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetMessageFile = scenario("getMessageFileSimulation")
        .feed(getMessageFilePATHFeeder)
        .exec(http("getMessageFile")
        .httpRequest("GET","/threads/${thread_id}/messages/${message_id}/files/${file_id}")
)

    // Run scngetMessageFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetMessageFile.inject(
        rampUsersPerSec(1) to(getMessageFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getMessageFilePerSecond) during(durationSeconds),
        rampUsersPerSec(getMessageFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetRun = scenario("getRunSimulation")
        .feed(getRunPATHFeeder)
        .exec(http("getRun")
        .httpRequest("GET","/threads/${thread_id}/runs/${run_id}")
)

    // Run scngetRun with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetRun.inject(
        rampUsersPerSec(1) to(getRunPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getRunPerSecond) during(durationSeconds),
        rampUsersPerSec(getRunPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetRunStep = scenario("getRunStepSimulation")
        .feed(getRunStepPATHFeeder)
        .exec(http("getRunStep")
        .httpRequest("GET","/threads/${thread_id}/runs/${run_id}/steps/${step_id}")
)

    // Run scngetRunStep with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetRunStep.inject(
        rampUsersPerSec(1) to(getRunStepPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getRunStepPerSecond) during(durationSeconds),
        rampUsersPerSec(getRunStepPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetThread = scenario("getThreadSimulation")
        .feed(getThreadPATHFeeder)
        .exec(http("getThread")
        .httpRequest("GET","/threads/${thread_id}")
)

    // Run scngetThread with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetThread.inject(
        rampUsersPerSec(1) to(getThreadPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getThreadPerSecond) during(durationSeconds),
        rampUsersPerSec(getThreadPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistAssistantFiles = scenario("listAssistantFilesSimulation")
        .feed(listAssistantFilesQUERYFeeder)
        .feed(listAssistantFilesPATHFeeder)
        .exec(http("listAssistantFiles")
        .httpRequest("GET","/assistants/${assistant_id}/files")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
        .queryParam("before","${before}")
        .queryParam("order","${order}")
)

    // Run scnlistAssistantFiles with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistAssistantFiles.inject(
        rampUsersPerSec(1) to(listAssistantFilesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listAssistantFilesPerSecond) during(durationSeconds),
        rampUsersPerSec(listAssistantFilesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistAssistants = scenario("listAssistantsSimulation")
        .feed(listAssistantsQUERYFeeder)
        .exec(http("listAssistants")
        .httpRequest("GET","/assistants")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
        .queryParam("before","${before}")
        .queryParam("order","${order}")
)

    // Run scnlistAssistants with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistAssistants.inject(
        rampUsersPerSec(1) to(listAssistantsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listAssistantsPerSecond) during(durationSeconds),
        rampUsersPerSec(listAssistantsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistMessageFiles = scenario("listMessageFilesSimulation")
        .feed(listMessageFilesQUERYFeeder)
        .feed(listMessageFilesPATHFeeder)
        .exec(http("listMessageFiles")
        .httpRequest("GET","/threads/${thread_id}/messages/${message_id}/files")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
        .queryParam("before","${before}")
        .queryParam("order","${order}")
)

    // Run scnlistMessageFiles with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistMessageFiles.inject(
        rampUsersPerSec(1) to(listMessageFilesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listMessageFilesPerSecond) during(durationSeconds),
        rampUsersPerSec(listMessageFilesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistMessages = scenario("listMessagesSimulation")
        .feed(listMessagesQUERYFeeder)
        .feed(listMessagesPATHFeeder)
        .exec(http("listMessages")
        .httpRequest("GET","/threads/${thread_id}/messages")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
        .queryParam("before","${before}")
        .queryParam("order","${order}")
        .queryParam("run_id","${run_id}")
)

    // Run scnlistMessages with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistMessages.inject(
        rampUsersPerSec(1) to(listMessagesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listMessagesPerSecond) during(durationSeconds),
        rampUsersPerSec(listMessagesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistRunSteps = scenario("listRunStepsSimulation")
        .feed(listRunStepsQUERYFeeder)
        .feed(listRunStepsPATHFeeder)
        .exec(http("listRunSteps")
        .httpRequest("GET","/threads/${thread_id}/runs/${run_id}/steps")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
        .queryParam("before","${before}")
        .queryParam("order","${order}")
)

    // Run scnlistRunSteps with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistRunSteps.inject(
        rampUsersPerSec(1) to(listRunStepsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listRunStepsPerSecond) during(durationSeconds),
        rampUsersPerSec(listRunStepsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistRuns = scenario("listRunsSimulation")
        .feed(listRunsQUERYFeeder)
        .feed(listRunsPATHFeeder)
        .exec(http("listRuns")
        .httpRequest("GET","/threads/${thread_id}/runs")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
        .queryParam("before","${before}")
        .queryParam("order","${order}")
)

    // Run scnlistRuns with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistRuns.inject(
        rampUsersPerSec(1) to(listRunsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listRunsPerSecond) during(durationSeconds),
        rampUsersPerSec(listRunsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmodifyAssistant = scenario("modifyAssistantSimulation")
        .feed(modifyAssistantPATHFeeder)
        .exec(http("modifyAssistant")
        .httpRequest("POST","/assistants/${assistant_id}")
)

    // Run scnmodifyAssistant with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmodifyAssistant.inject(
        rampUsersPerSec(1) to(modifyAssistantPerSecond) during(rampUpSeconds),
        constantUsersPerSec(modifyAssistantPerSecond) during(durationSeconds),
        rampUsersPerSec(modifyAssistantPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmodifyMessage = scenario("modifyMessageSimulation")
        .feed(modifyMessagePATHFeeder)
        .exec(http("modifyMessage")
        .httpRequest("POST","/threads/${thread_id}/messages/${message_id}")
)

    // Run scnmodifyMessage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmodifyMessage.inject(
        rampUsersPerSec(1) to(modifyMessagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(modifyMessagePerSecond) during(durationSeconds),
        rampUsersPerSec(modifyMessagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmodifyRun = scenario("modifyRunSimulation")
        .feed(modifyRunPATHFeeder)
        .exec(http("modifyRun")
        .httpRequest("POST","/threads/${thread_id}/runs/${run_id}")
)

    // Run scnmodifyRun with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmodifyRun.inject(
        rampUsersPerSec(1) to(modifyRunPerSecond) during(rampUpSeconds),
        constantUsersPerSec(modifyRunPerSecond) during(durationSeconds),
        rampUsersPerSec(modifyRunPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmodifyThread = scenario("modifyThreadSimulation")
        .feed(modifyThreadPATHFeeder)
        .exec(http("modifyThread")
        .httpRequest("POST","/threads/${thread_id}")
)

    // Run scnmodifyThread with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmodifyThread.inject(
        rampUsersPerSec(1) to(modifyThreadPerSecond) during(rampUpSeconds),
        constantUsersPerSec(modifyThreadPerSecond) during(durationSeconds),
        rampUsersPerSec(modifyThreadPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsubmitToolOuputsToRun = scenario("submitToolOuputsToRunSimulation")
        .feed(submitToolOuputsToRunPATHFeeder)
        .exec(http("submitToolOuputsToRun")
        .httpRequest("POST","/threads/${thread_id}/runs/${run_id}/submit_tool_outputs")
)

    // Run scnsubmitToolOuputsToRun with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsubmitToolOuputsToRun.inject(
        rampUsersPerSec(1) to(submitToolOuputsToRunPerSecond) during(rampUpSeconds),
        constantUsersPerSec(submitToolOuputsToRunPerSecond) during(durationSeconds),
        rampUsersPerSec(submitToolOuputsToRunPerSecond) to(1) during(rampDownSeconds)
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
