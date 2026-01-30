package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.ErrorResponse
import org.openapitools.server.api.model.Project
import org.openapitools.server.api.model.ProjectApiKey
import org.openapitools.server.api.model.ProjectApiKeyDeleteResponse
import org.openapitools.server.api.model.ProjectApiKeyListResponse
import org.openapitools.server.api.model.ProjectCreateRequest
import org.openapitools.server.api.model.ProjectListResponse
import org.openapitools.server.api.model.ProjectRateLimit
import org.openapitools.server.api.model.ProjectRateLimitListResponse
import org.openapitools.server.api.model.ProjectRateLimitUpdateRequest
import org.openapitools.server.api.model.ProjectServiceAccount
import org.openapitools.server.api.model.ProjectServiceAccountCreateRequest
import org.openapitools.server.api.model.ProjectServiceAccountCreateResponse
import org.openapitools.server.api.model.ProjectServiceAccountDeleteResponse
import org.openapitools.server.api.model.ProjectServiceAccountListResponse
import org.openapitools.server.api.model.ProjectUpdateRequest
import org.openapitools.server.api.model.ProjectUser
import org.openapitools.server.api.model.ProjectUserCreateRequest
import org.openapitools.server.api.model.ProjectUserDeleteResponse
import org.openapitools.server.api.model.ProjectUserListResponse
import org.openapitools.server.api.model.ProjectUserUpdateRequest
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface ProjectsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* archiveProject
     * Archives a project in the organization. Archived projects cannot be used or updated. */
    suspend fun archiveProject(projectId:kotlin.String?,context:OperationRequest):Response<Project>
    /* createProject
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted. */
    suspend fun createProject(projectCreateRequest:ProjectCreateRequest?,context:OperationRequest):Response<Project>
    /* createProjectServiceAccount
     * Creates a new service account in the project. This also returns an unredacted API key for the service account. */
    suspend fun createProjectServiceAccount(projectId:kotlin.String?,projectServiceAccountCreateRequest:ProjectServiceAccountCreateRequest?,context:OperationRequest):Response<ProjectServiceAccountCreateResponse>
    /* createProjectUser
     * Adds a user to the project. Users must already be members of the organization to be added to a project. */
    suspend fun createProjectUser(projectId:kotlin.String?,projectUserCreateRequest:ProjectUserCreateRequest?,context:OperationRequest):Response<ProjectUser>
    /* deleteProjectApiKey
     * Deletes an API key from the project. */
    suspend fun deleteProjectApiKey(projectId:kotlin.String?,keyId:kotlin.String?,context:OperationRequest):Response<ProjectApiKeyDeleteResponse>
    /* deleteProjectServiceAccount
     * Deletes a service account from the project. */
    suspend fun deleteProjectServiceAccount(projectId:kotlin.String?,serviceAccountId:kotlin.String?,context:OperationRequest):Response<ProjectServiceAccountDeleteResponse>
    /* deleteProjectUser
     * Deletes a user from the project. */
    suspend fun deleteProjectUser(projectId:kotlin.String?,userId:kotlin.String?,context:OperationRequest):Response<ProjectUserDeleteResponse>
    /* listProjectApiKeys
     * Returns a list of API keys in the project. */
    suspend fun listProjectApiKeys(projectId:kotlin.String?,limit:kotlin.Int?,after:kotlin.String?,context:OperationRequest):Response<ProjectApiKeyListResponse>
    /* listProjectRateLimits
     * Returns the rate limits per model for a project. */
    suspend fun listProjectRateLimits(projectId:kotlin.String?,limit:kotlin.Int?,after:kotlin.String?,before:kotlin.String?,context:OperationRequest):Response<ProjectRateLimitListResponse>
    /* listProjectServiceAccounts
     * Returns a list of service accounts in the project. */
    suspend fun listProjectServiceAccounts(projectId:kotlin.String?,limit:kotlin.Int?,after:kotlin.String?,context:OperationRequest):Response<ProjectServiceAccountListResponse>
    /* listProjectUsers
     * Returns a list of users in the project. */
    suspend fun listProjectUsers(projectId:kotlin.String?,limit:kotlin.Int?,after:kotlin.String?,context:OperationRequest):Response<ProjectUserListResponse>
    /* listProjects
     * Returns a list of projects. */
    suspend fun listProjects(limit:kotlin.Int?,after:kotlin.String?,includeArchived:kotlin.Boolean?,context:OperationRequest):Response<ProjectListResponse>
    /* modifyProject
     * Modifies a project in the organization. */
    suspend fun modifyProject(projectId:kotlin.String?,projectUpdateRequest:ProjectUpdateRequest?,context:OperationRequest):Response<Project>
    /* modifyProjectUser
     * Modifies a user&#39;s role in the project. */
    suspend fun modifyProjectUser(projectId:kotlin.String?,userId:kotlin.String?,projectUserUpdateRequest:ProjectUserUpdateRequest?,context:OperationRequest):Response<ProjectUser>
    /* retrieveProject
     * Retrieves a project. */
    suspend fun retrieveProject(projectId:kotlin.String?,context:OperationRequest):Response<Project>
    /* retrieveProjectApiKey
     * Retrieves an API key in the project. */
    suspend fun retrieveProjectApiKey(projectId:kotlin.String?,keyId:kotlin.String?,context:OperationRequest):Response<ProjectApiKey>
    /* retrieveProjectServiceAccount
     * Retrieves a service account in the project. */
    suspend fun retrieveProjectServiceAccount(projectId:kotlin.String?,serviceAccountId:kotlin.String?,context:OperationRequest):Response<ProjectServiceAccount>
    /* retrieveProjectUser
     * Retrieves a user in the project. */
    suspend fun retrieveProjectUser(projectId:kotlin.String?,userId:kotlin.String?,context:OperationRequest):Response<ProjectUser>
    /* updateProjectRateLimits
     * Updates a project rate limit. */
    suspend fun updateProjectRateLimits(projectId:kotlin.String?,rateLimitId:kotlin.String?,projectRateLimitUpdateRequest:ProjectRateLimitUpdateRequest?,context:OperationRequest):Response<ProjectRateLimit>
    companion object {
        const val address = "ProjectsApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in ProjectsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ProjectsApi::class.java, address)
            return routerFactory
        }
    }
}
