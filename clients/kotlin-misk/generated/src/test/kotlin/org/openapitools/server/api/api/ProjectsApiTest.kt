package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
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

@MiskTest(startService = true)
internal class ProjectsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var projectsApi: ProjectsApiAction

    /**
     * To test ProjectsApiAction.archiveProject
     */
    @Test
    fun `should handle archiveProject`() {
        val projectId = TODO()
        val response: Project = projectsApi.archiveProject(projectId)
    }

    /**
     * To test ProjectsApiAction.createProject
     */
    @Test
    fun `should handle createProject`() {
        val projectCreateRequest = TODO()
        val response: Project = projectsApi.createProject(projectCreateRequest)
    }

    /**
     * To test ProjectsApiAction.createProjectServiceAccount
     */
    @Test
    fun `should handle createProjectServiceAccount`() {
        val projectId = TODO()
        val projectServiceAccountCreateRequest = TODO()
        val response: ProjectServiceAccountCreateResponse = projectsApi.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest)
    }

    /**
     * To test ProjectsApiAction.createProjectUser
     */
    @Test
    fun `should handle createProjectUser`() {
        val projectId = TODO()
        val projectUserCreateRequest = TODO()
        val response: ProjectUser = projectsApi.createProjectUser(projectId, projectUserCreateRequest)
    }

    /**
     * To test ProjectsApiAction.deleteProjectApiKey
     */
    @Test
    fun `should handle deleteProjectApiKey`() {
        val projectId = TODO()
        val keyId = TODO()
        val response: ProjectApiKeyDeleteResponse = projectsApi.deleteProjectApiKey(projectId, keyId)
    }

    /**
     * To test ProjectsApiAction.deleteProjectServiceAccount
     */
    @Test
    fun `should handle deleteProjectServiceAccount`() {
        val projectId = TODO()
        val serviceAccountId = TODO()
        val response: ProjectServiceAccountDeleteResponse = projectsApi.deleteProjectServiceAccount(projectId, serviceAccountId)
    }

    /**
     * To test ProjectsApiAction.deleteProjectUser
     */
    @Test
    fun `should handle deleteProjectUser`() {
        val projectId = TODO()
        val userId = TODO()
        val response: ProjectUserDeleteResponse = projectsApi.deleteProjectUser(projectId, userId)
    }

    /**
     * To test ProjectsApiAction.listProjectApiKeys
     */
    @Test
    fun `should handle listProjectApiKeys`() {
        val projectId = TODO()
        val limit = TODO()
        val after = TODO()
        val response: ProjectApiKeyListResponse = projectsApi.listProjectApiKeys(projectId, limit, after)
    }

    /**
     * To test ProjectsApiAction.listProjectRateLimits
     */
    @Test
    fun `should handle listProjectRateLimits`() {
        val projectId = TODO()
        val limit = TODO()
        val after = TODO()
        val before = TODO()
        val response: ProjectRateLimitListResponse = projectsApi.listProjectRateLimits(projectId, limit, after, before)
    }

    /**
     * To test ProjectsApiAction.listProjectServiceAccounts
     */
    @Test
    fun `should handle listProjectServiceAccounts`() {
        val projectId = TODO()
        val limit = TODO()
        val after = TODO()
        val response: ProjectServiceAccountListResponse = projectsApi.listProjectServiceAccounts(projectId, limit, after)
    }

    /**
     * To test ProjectsApiAction.listProjectUsers
     */
    @Test
    fun `should handle listProjectUsers`() {
        val projectId = TODO()
        val limit = TODO()
        val after = TODO()
        val response: ProjectUserListResponse = projectsApi.listProjectUsers(projectId, limit, after)
    }

    /**
     * To test ProjectsApiAction.listProjects
     */
    @Test
    fun `should handle listProjects`() {
        val limit = TODO()
        val after = TODO()
        val includeArchived = TODO()
        val response: ProjectListResponse = projectsApi.listProjects(limit, after, includeArchived)
    }

    /**
     * To test ProjectsApiAction.modifyProject
     */
    @Test
    fun `should handle modifyProject`() {
        val projectId = TODO()
        val projectUpdateRequest = TODO()
        val response: Project = projectsApi.modifyProject(projectId, projectUpdateRequest)
    }

    /**
     * To test ProjectsApiAction.modifyProjectUser
     */
    @Test
    fun `should handle modifyProjectUser`() {
        val projectId = TODO()
        val userId = TODO()
        val projectUserUpdateRequest = TODO()
        val response: ProjectUser = projectsApi.modifyProjectUser(projectId, userId, projectUserUpdateRequest)
    }

    /**
     * To test ProjectsApiAction.retrieveProject
     */
    @Test
    fun `should handle retrieveProject`() {
        val projectId = TODO()
        val response: Project = projectsApi.retrieveProject(projectId)
    }

    /**
     * To test ProjectsApiAction.retrieveProjectApiKey
     */
    @Test
    fun `should handle retrieveProjectApiKey`() {
        val projectId = TODO()
        val keyId = TODO()
        val response: ProjectApiKey = projectsApi.retrieveProjectApiKey(projectId, keyId)
    }

    /**
     * To test ProjectsApiAction.retrieveProjectServiceAccount
     */
    @Test
    fun `should handle retrieveProjectServiceAccount`() {
        val projectId = TODO()
        val serviceAccountId = TODO()
        val response: ProjectServiceAccount = projectsApi.retrieveProjectServiceAccount(projectId, serviceAccountId)
    }

    /**
     * To test ProjectsApiAction.retrieveProjectUser
     */
    @Test
    fun `should handle retrieveProjectUser`() {
        val projectId = TODO()
        val userId = TODO()
        val response: ProjectUser = projectsApi.retrieveProjectUser(projectId, userId)
    }

    /**
     * To test ProjectsApiAction.updateProjectRateLimits
     */
    @Test
    fun `should handle updateProjectRateLimits`() {
        val projectId = TODO()
        val rateLimitId = TODO()
        val projectRateLimitUpdateRequest = TODO()
        val response: ProjectRateLimit = projectsApi.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)
    }
}
