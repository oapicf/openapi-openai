package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ProjectsApiSimulation extends Simulation {

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
    val archiveProjectPerSecond = config.getDouble("performance.operationsPerSecond.archiveProject") * rateMultiplier * instanceMultiplier
    val createProjectPerSecond = config.getDouble("performance.operationsPerSecond.createProject") * rateMultiplier * instanceMultiplier
    val createProjectServiceAccountPerSecond = config.getDouble("performance.operationsPerSecond.createProjectServiceAccount") * rateMultiplier * instanceMultiplier
    val createProjectUserPerSecond = config.getDouble("performance.operationsPerSecond.createProjectUser") * rateMultiplier * instanceMultiplier
    val deleteProjectApiKeyPerSecond = config.getDouble("performance.operationsPerSecond.deleteProjectApiKey") * rateMultiplier * instanceMultiplier
    val deleteProjectServiceAccountPerSecond = config.getDouble("performance.operationsPerSecond.deleteProjectServiceAccount") * rateMultiplier * instanceMultiplier
    val deleteProjectUserPerSecond = config.getDouble("performance.operationsPerSecond.deleteProjectUser") * rateMultiplier * instanceMultiplier
    val listProjectApiKeysPerSecond = config.getDouble("performance.operationsPerSecond.listProjectApiKeys") * rateMultiplier * instanceMultiplier
    val listProjectRateLimitsPerSecond = config.getDouble("performance.operationsPerSecond.listProjectRateLimits") * rateMultiplier * instanceMultiplier
    val listProjectServiceAccountsPerSecond = config.getDouble("performance.operationsPerSecond.listProjectServiceAccounts") * rateMultiplier * instanceMultiplier
    val listProjectUsersPerSecond = config.getDouble("performance.operationsPerSecond.listProjectUsers") * rateMultiplier * instanceMultiplier
    val listProjectsPerSecond = config.getDouble("performance.operationsPerSecond.listProjects") * rateMultiplier * instanceMultiplier
    val modifyProjectPerSecond = config.getDouble("performance.operationsPerSecond.modifyProject") * rateMultiplier * instanceMultiplier
    val modifyProjectUserPerSecond = config.getDouble("performance.operationsPerSecond.modifyProjectUser") * rateMultiplier * instanceMultiplier
    val retrieveProjectPerSecond = config.getDouble("performance.operationsPerSecond.retrieveProject") * rateMultiplier * instanceMultiplier
    val retrieveProjectApiKeyPerSecond = config.getDouble("performance.operationsPerSecond.retrieveProjectApiKey") * rateMultiplier * instanceMultiplier
    val retrieveProjectServiceAccountPerSecond = config.getDouble("performance.operationsPerSecond.retrieveProjectServiceAccount") * rateMultiplier * instanceMultiplier
    val retrieveProjectUserPerSecond = config.getDouble("performance.operationsPerSecond.retrieveProjectUser") * rateMultiplier * instanceMultiplier
    val updateProjectRateLimitsPerSecond = config.getDouble("performance.operationsPerSecond.updateProjectRateLimits") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val archive-projectPATHFeeder = csv(userDataDirectory + File.separator + "archiveProject-pathParams.csv").random
    val create-project-service-accountPATHFeeder = csv(userDataDirectory + File.separator + "createProjectServiceAccount-pathParams.csv").random
    val create-project-userPATHFeeder = csv(userDataDirectory + File.separator + "createProjectUser-pathParams.csv").random
    val delete-project-api-keyPATHFeeder = csv(userDataDirectory + File.separator + "deleteProjectApiKey-pathParams.csv").random
    val delete-project-service-accountPATHFeeder = csv(userDataDirectory + File.separator + "deleteProjectServiceAccount-pathParams.csv").random
    val delete-project-userPATHFeeder = csv(userDataDirectory + File.separator + "deleteProjectUser-pathParams.csv").random
    val list-project-api-keysQUERYFeeder = csv(userDataDirectory + File.separator + "listProjectApiKeys-queryParams.csv").random
    val list-project-api-keysPATHFeeder = csv(userDataDirectory + File.separator + "listProjectApiKeys-pathParams.csv").random
    val list-project-rate-limitsQUERYFeeder = csv(userDataDirectory + File.separator + "listProjectRateLimits-queryParams.csv").random
    val list-project-rate-limitsPATHFeeder = csv(userDataDirectory + File.separator + "listProjectRateLimits-pathParams.csv").random
    val list-project-service-accountsQUERYFeeder = csv(userDataDirectory + File.separator + "listProjectServiceAccounts-queryParams.csv").random
    val list-project-service-accountsPATHFeeder = csv(userDataDirectory + File.separator + "listProjectServiceAccounts-pathParams.csv").random
    val list-project-usersQUERYFeeder = csv(userDataDirectory + File.separator + "listProjectUsers-queryParams.csv").random
    val list-project-usersPATHFeeder = csv(userDataDirectory + File.separator + "listProjectUsers-pathParams.csv").random
    val list-projectsQUERYFeeder = csv(userDataDirectory + File.separator + "listProjects-queryParams.csv").random
    val modify-projectPATHFeeder = csv(userDataDirectory + File.separator + "modifyProject-pathParams.csv").random
    val modify-project-userPATHFeeder = csv(userDataDirectory + File.separator + "modifyProjectUser-pathParams.csv").random
    val retrieve-projectPATHFeeder = csv(userDataDirectory + File.separator + "retrieveProject-pathParams.csv").random
    val retrieve-project-api-keyPATHFeeder = csv(userDataDirectory + File.separator + "retrieveProjectApiKey-pathParams.csv").random
    val retrieve-project-service-accountPATHFeeder = csv(userDataDirectory + File.separator + "retrieveProjectServiceAccount-pathParams.csv").random
    val retrieve-project-userPATHFeeder = csv(userDataDirectory + File.separator + "retrieveProjectUser-pathParams.csv").random
    val update-project-rate-limitsPATHFeeder = csv(userDataDirectory + File.separator + "updateProjectRateLimits-pathParams.csv").random

    // Setup all scenarios

    
    val scnarchiveProject = scenario("archiveProjectSimulation")
        .feed(archive-projectPATHFeeder)
        .exec(http("archiveProject")
        .httpRequest("POST","/organization/projects/${project_id}/archive")
)

    // Run scnarchiveProject with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnarchiveProject.inject(
        rampUsersPerSec(1) to(archiveProjectPerSecond) during(rampUpSeconds),
        constantUsersPerSec(archiveProjectPerSecond) during(durationSeconds),
        rampUsersPerSec(archiveProjectPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateProject = scenario("createProjectSimulation")
        .exec(http("createProject")
        .httpRequest("POST","/organization/projects")
)

    // Run scncreateProject with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateProject.inject(
        rampUsersPerSec(1) to(createProjectPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createProjectPerSecond) during(durationSeconds),
        rampUsersPerSec(createProjectPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateProjectServiceAccount = scenario("createProjectServiceAccountSimulation")
        .feed(create-project-service-accountPATHFeeder)
        .exec(http("createProjectServiceAccount")
        .httpRequest("POST","/organization/projects/${project_id}/service_accounts")
)

    // Run scncreateProjectServiceAccount with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateProjectServiceAccount.inject(
        rampUsersPerSec(1) to(createProjectServiceAccountPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createProjectServiceAccountPerSecond) during(durationSeconds),
        rampUsersPerSec(createProjectServiceAccountPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateProjectUser = scenario("createProjectUserSimulation")
        .feed(create-project-userPATHFeeder)
        .exec(http("createProjectUser")
        .httpRequest("POST","/organization/projects/${project_id}/users")
)

    // Run scncreateProjectUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateProjectUser.inject(
        rampUsersPerSec(1) to(createProjectUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createProjectUserPerSecond) during(durationSeconds),
        rampUsersPerSec(createProjectUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteProjectApiKey = scenario("deleteProjectApiKeySimulation")
        .feed(delete-project-api-keyPATHFeeder)
        .exec(http("deleteProjectApiKey")
        .httpRequest("DELETE","/organization/projects/${project_id}/api_keys/${key_id}")
)

    // Run scndeleteProjectApiKey with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteProjectApiKey.inject(
        rampUsersPerSec(1) to(deleteProjectApiKeyPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteProjectApiKeyPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteProjectApiKeyPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteProjectServiceAccount = scenario("deleteProjectServiceAccountSimulation")
        .feed(delete-project-service-accountPATHFeeder)
        .exec(http("deleteProjectServiceAccount")
        .httpRequest("DELETE","/organization/projects/${project_id}/service_accounts/${service_account_id}")
)

    // Run scndeleteProjectServiceAccount with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteProjectServiceAccount.inject(
        rampUsersPerSec(1) to(deleteProjectServiceAccountPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteProjectServiceAccountPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteProjectServiceAccountPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteProjectUser = scenario("deleteProjectUserSimulation")
        .feed(delete-project-userPATHFeeder)
        .exec(http("deleteProjectUser")
        .httpRequest("DELETE","/organization/projects/${project_id}/users/${user_id}")
)

    // Run scndeleteProjectUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteProjectUser.inject(
        rampUsersPerSec(1) to(deleteProjectUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteProjectUserPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteProjectUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistProjectApiKeys = scenario("listProjectApiKeysSimulation")
        .feed(list-project-api-keysQUERYFeeder)
        .feed(list-project-api-keysPATHFeeder)
        .exec(http("listProjectApiKeys")
        .httpRequest("GET","/organization/projects/${project_id}/api_keys")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
)

    // Run scnlistProjectApiKeys with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistProjectApiKeys.inject(
        rampUsersPerSec(1) to(listProjectApiKeysPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listProjectApiKeysPerSecond) during(durationSeconds),
        rampUsersPerSec(listProjectApiKeysPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistProjectRateLimits = scenario("listProjectRateLimitsSimulation")
        .feed(list-project-rate-limitsQUERYFeeder)
        .feed(list-project-rate-limitsPATHFeeder)
        .exec(http("listProjectRateLimits")
        .httpRequest("GET","/organization/projects/${project_id}/rate_limits")
        .queryParam("before","${before}")
        .queryParam("after","${after}")
        .queryParam("limit","${limit}")
)

    // Run scnlistProjectRateLimits with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistProjectRateLimits.inject(
        rampUsersPerSec(1) to(listProjectRateLimitsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listProjectRateLimitsPerSecond) during(durationSeconds),
        rampUsersPerSec(listProjectRateLimitsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistProjectServiceAccounts = scenario("listProjectServiceAccountsSimulation")
        .feed(list-project-service-accountsQUERYFeeder)
        .feed(list-project-service-accountsPATHFeeder)
        .exec(http("listProjectServiceAccounts")
        .httpRequest("GET","/organization/projects/${project_id}/service_accounts")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
)

    // Run scnlistProjectServiceAccounts with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistProjectServiceAccounts.inject(
        rampUsersPerSec(1) to(listProjectServiceAccountsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listProjectServiceAccountsPerSecond) during(durationSeconds),
        rampUsersPerSec(listProjectServiceAccountsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistProjectUsers = scenario("listProjectUsersSimulation")
        .feed(list-project-usersQUERYFeeder)
        .feed(list-project-usersPATHFeeder)
        .exec(http("listProjectUsers")
        .httpRequest("GET","/organization/projects/${project_id}/users")
        .queryParam("limit","${limit}")
        .queryParam("after","${after}")
)

    // Run scnlistProjectUsers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistProjectUsers.inject(
        rampUsersPerSec(1) to(listProjectUsersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listProjectUsersPerSecond) during(durationSeconds),
        rampUsersPerSec(listProjectUsersPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistProjects = scenario("listProjectsSimulation")
        .feed(list-projectsQUERYFeeder)
        .exec(http("listProjects")
        .httpRequest("GET","/organization/projects")
        .queryParam("limit","${limit}")
        .queryParam("include_archived","${include_archived}")
        .queryParam("after","${after}")
)

    // Run scnlistProjects with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistProjects.inject(
        rampUsersPerSec(1) to(listProjectsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listProjectsPerSecond) during(durationSeconds),
        rampUsersPerSec(listProjectsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmodifyProject = scenario("modifyProjectSimulation")
        .feed(modify-projectPATHFeeder)
        .exec(http("modifyProject")
        .httpRequest("POST","/organization/projects/${project_id}")
)

    // Run scnmodifyProject with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmodifyProject.inject(
        rampUsersPerSec(1) to(modifyProjectPerSecond) during(rampUpSeconds),
        constantUsersPerSec(modifyProjectPerSecond) during(durationSeconds),
        rampUsersPerSec(modifyProjectPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmodifyProjectUser = scenario("modifyProjectUserSimulation")
        .feed(modify-project-userPATHFeeder)
        .exec(http("modifyProjectUser")
        .httpRequest("POST","/organization/projects/${project_id}/users/${user_id}")
)

    // Run scnmodifyProjectUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmodifyProjectUser.inject(
        rampUsersPerSec(1) to(modifyProjectUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(modifyProjectUserPerSecond) during(durationSeconds),
        rampUsersPerSec(modifyProjectUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnretrieveProject = scenario("retrieveProjectSimulation")
        .feed(retrieve-projectPATHFeeder)
        .exec(http("retrieveProject")
        .httpRequest("GET","/organization/projects/${project_id}")
)

    // Run scnretrieveProject with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnretrieveProject.inject(
        rampUsersPerSec(1) to(retrieveProjectPerSecond) during(rampUpSeconds),
        constantUsersPerSec(retrieveProjectPerSecond) during(durationSeconds),
        rampUsersPerSec(retrieveProjectPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnretrieveProjectApiKey = scenario("retrieveProjectApiKeySimulation")
        .feed(retrieve-project-api-keyPATHFeeder)
        .exec(http("retrieveProjectApiKey")
        .httpRequest("GET","/organization/projects/${project_id}/api_keys/${key_id}")
)

    // Run scnretrieveProjectApiKey with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnretrieveProjectApiKey.inject(
        rampUsersPerSec(1) to(retrieveProjectApiKeyPerSecond) during(rampUpSeconds),
        constantUsersPerSec(retrieveProjectApiKeyPerSecond) during(durationSeconds),
        rampUsersPerSec(retrieveProjectApiKeyPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnretrieveProjectServiceAccount = scenario("retrieveProjectServiceAccountSimulation")
        .feed(retrieve-project-service-accountPATHFeeder)
        .exec(http("retrieveProjectServiceAccount")
        .httpRequest("GET","/organization/projects/${project_id}/service_accounts/${service_account_id}")
)

    // Run scnretrieveProjectServiceAccount with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnretrieveProjectServiceAccount.inject(
        rampUsersPerSec(1) to(retrieveProjectServiceAccountPerSecond) during(rampUpSeconds),
        constantUsersPerSec(retrieveProjectServiceAccountPerSecond) during(durationSeconds),
        rampUsersPerSec(retrieveProjectServiceAccountPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnretrieveProjectUser = scenario("retrieveProjectUserSimulation")
        .feed(retrieve-project-userPATHFeeder)
        .exec(http("retrieveProjectUser")
        .httpRequest("GET","/organization/projects/${project_id}/users/${user_id}")
)

    // Run scnretrieveProjectUser with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnretrieveProjectUser.inject(
        rampUsersPerSec(1) to(retrieveProjectUserPerSecond) during(rampUpSeconds),
        constantUsersPerSec(retrieveProjectUserPerSecond) during(durationSeconds),
        rampUsersPerSec(retrieveProjectUserPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateProjectRateLimits = scenario("updateProjectRateLimitsSimulation")
        .feed(update-project-rate-limitsPATHFeeder)
        .exec(http("updateProjectRateLimits")
        .httpRequest("POST","/organization/projects/${project_id}/rate_limits/${rate_limit_id}")
)

    // Run scnupdateProjectRateLimits with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateProjectRateLimits.inject(
        rampUsersPerSec(1) to(updateProjectRateLimitsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateProjectRateLimitsPerSecond) during(durationSeconds),
        rampUsersPerSec(updateProjectRateLimitsPerSecond) to(1) during(rampDownSeconds)
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
