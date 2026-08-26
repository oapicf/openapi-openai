package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
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

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ProjectsApiAction @Inject constructor(
) : WebAction {

    @Post("/organization/projects/{project_id}/archive")
    @Description("Archives a project in the organization. Archived projects cannot be used or updated.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun archiveProject(
        @PathParam("project_id") projectId: kotlin.String
    ): Project {
        TODO()
    }

    @Post("/organization/projects")
    @Description("Create a new project in the organization. Projects can be created and archived, but cannot be deleted.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createProject(
        @Valid @RequestBody projectCreateRequest: ProjectCreateRequest
    ): Project {
        TODO()
    }

    @Post("/organization/projects/{project_id}/service_accounts")
    @Description("Creates a new service account in the project. This also returns an unredacted API key for the service account.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createProjectServiceAccount(
        @PathParam("project_id") projectId: kotlin.String, 
        @Valid @RequestBody projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest
    ): ProjectServiceAccountCreateResponse {
        TODO()
    }

    @Post("/organization/projects/{project_id}/users")
    @Description("Adds a user to the project. Users must already be members of the organization to be added to a project.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createProjectUser(
        @PathParam("project_id") projectId: kotlin.String, 
        @Valid @RequestBody projectUserCreateRequest: ProjectUserCreateRequest
    ): ProjectUser {
        TODO()
    }

    @Delete("/organization/projects/{project_id}/api_keys/{key_id}")
    @Description("Deletes an API key from the project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteProjectApiKey(
        @PathParam("project_id") projectId: kotlin.String, 
        @PathParam("key_id") keyId: kotlin.String
    ): ProjectApiKeyDeleteResponse {
        TODO()
    }

    @Delete("/organization/projects/{project_id}/service_accounts/{service_account_id}")
    @Description("Deletes a service account from the project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteProjectServiceAccount(
        @PathParam("project_id") projectId: kotlin.String, 
        @PathParam("service_account_id") serviceAccountId: kotlin.String
    ): ProjectServiceAccountDeleteResponse {
        TODO()
    }

    @Delete("/organization/projects/{project_id}/users/{user_id}")
    @Description("Deletes a user from the project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteProjectUser(
        @PathParam("project_id") projectId: kotlin.String, 
        @PathParam("user_id") userId: kotlin.String
    ): ProjectUserDeleteResponse {
        TODO()
    }

    @Get("/organization/projects/{project_id}/api_keys")
    @Description("Returns a list of API keys in the project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listProjectApiKeys(
        @PathParam("project_id") projectId: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "after") after: kotlin.String?
    ): ProjectApiKeyListResponse {
        TODO()
    }

    @Get("/organization/projects/{project_id}/rate_limits")
    @Description("Returns the rate limits per model for a project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listProjectRateLimits(
        @PathParam("project_id") projectId: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "before") before: kotlin.String?
    ): ProjectRateLimitListResponse {
        TODO()
    }

    @Get("/organization/projects/{project_id}/service_accounts")
    @Description("Returns a list of service accounts in the project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listProjectServiceAccounts(
        @PathParam("project_id") projectId: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "after") after: kotlin.String?
    ): ProjectServiceAccountListResponse {
        TODO()
    }

    @Get("/organization/projects/{project_id}/users")
    @Description("Returns a list of users in the project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listProjectUsers(
        @PathParam("project_id") projectId: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "after") after: kotlin.String?
    ): ProjectUserListResponse {
        TODO()
    }

    @Get("/organization/projects")
    @Description("Returns a list of projects.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listProjects(
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "include_archived") includeArchived: kotlin.Boolean
    ): ProjectListResponse {
        TODO()
    }

    @Post("/organization/projects/{project_id}")
    @Description("Modifies a project in the organization.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun modifyProject(
        @PathParam("project_id") projectId: kotlin.String, 
        @Valid @RequestBody projectUpdateRequest: ProjectUpdateRequest
    ): Project {
        TODO()
    }

    @Post("/organization/projects/{project_id}/users/{user_id}")
    @Description("Modifies a user's role in the project.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun modifyProjectUser(
        @PathParam("project_id") projectId: kotlin.String, 
        @PathParam("user_id") userId: kotlin.String, 
        @Valid @RequestBody projectUserUpdateRequest: ProjectUserUpdateRequest
    ): ProjectUser {
        TODO()
    }

    @Get("/organization/projects/{project_id}")
    @Description("Retrieves a project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun retrieveProject(
        @PathParam("project_id") projectId: kotlin.String
    ): Project {
        TODO()
    }

    @Get("/organization/projects/{project_id}/api_keys/{key_id}")
    @Description("Retrieves an API key in the project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun retrieveProjectApiKey(
        @PathParam("project_id") projectId: kotlin.String, 
        @PathParam("key_id") keyId: kotlin.String
    ): ProjectApiKey {
        TODO()
    }

    @Get("/organization/projects/{project_id}/service_accounts/{service_account_id}")
    @Description("Retrieves a service account in the project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun retrieveProjectServiceAccount(
        @PathParam("project_id") projectId: kotlin.String, 
        @PathParam("service_account_id") serviceAccountId: kotlin.String
    ): ProjectServiceAccount {
        TODO()
    }

    @Get("/organization/projects/{project_id}/users/{user_id}")
    @Description("Retrieves a user in the project.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun retrieveProjectUser(
        @PathParam("project_id") projectId: kotlin.String, 
        @PathParam("user_id") userId: kotlin.String
    ): ProjectUser {
        TODO()
    }

    @Post("/organization/projects/{project_id}/rate_limits/{rate_limit_id}")
    @Description("Updates a project rate limit.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun updateProjectRateLimits(
        @PathParam("project_id") projectId: kotlin.String, 
        @PathParam("rate_limit_id") rateLimitId: kotlin.String, 
        @Valid @RequestBody projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest
    ): ProjectRateLimit {
        TODO()
    }
}
