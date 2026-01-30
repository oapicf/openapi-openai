package org.openapitools.api

import org.openapitools.model.AdminApiKey
import org.openapitools.model.AdminApiKeysCreateRequest
import org.openapitools.model.AdminApiKeysDelete200Response
import org.openapitools.model.ApiKeyList
import org.openapitools.model.AuditLogEventType
import org.openapitools.model.ErrorResponse
import org.openapitools.model.Invite
import org.openapitools.model.InviteDeleteResponse
import org.openapitools.model.InviteListResponse
import org.openapitools.model.InviteRequest
import org.openapitools.model.ListAuditLogsEffectiveAtParameter
import org.openapitools.model.ListAuditLogsResponse
import org.openapitools.model.Project
import org.openapitools.model.ProjectApiKey
import org.openapitools.model.ProjectApiKeyDeleteResponse
import org.openapitools.model.ProjectApiKeyListResponse
import org.openapitools.model.ProjectCreateRequest
import org.openapitools.model.ProjectListResponse
import org.openapitools.model.ProjectRateLimit
import org.openapitools.model.ProjectRateLimitListResponse
import org.openapitools.model.ProjectRateLimitUpdateRequest
import org.openapitools.model.ProjectServiceAccount
import org.openapitools.model.ProjectServiceAccountCreateRequest
import org.openapitools.model.ProjectServiceAccountCreateResponse
import org.openapitools.model.ProjectServiceAccountDeleteResponse
import org.openapitools.model.ProjectServiceAccountListResponse
import org.openapitools.model.ProjectUpdateRequest
import org.openapitools.model.ProjectUser
import org.openapitools.model.ProjectUserCreateRequest
import org.openapitools.model.ProjectUserDeleteResponse
import org.openapitools.model.ProjectUserListResponse
import org.openapitools.model.ProjectUserUpdateRequest
import org.openapitools.model.UsageResponse
import org.openapitools.model.User
import org.openapitools.model.UserDeleteResponse
import org.openapitools.model.UserListResponse
import org.openapitools.model.UserRoleUpdateRequest
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class OrganizationApiTest {

    private val api: OrganizationApiController = OrganizationApiController()

    /**
     * To test OrganizationApiController.adminApiKeysCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adminApiKeysCreateTest() {
        val adminApiKeysCreateRequest: AdminApiKeysCreateRequest = TODO()
        
        val response: ResponseEntity<AdminApiKey> = api.adminApiKeysCreate(adminApiKeysCreateRequest)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.adminApiKeysDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adminApiKeysDeleteTest() {
        val keyId: kotlin.String = TODO()
        
        val response: ResponseEntity<AdminApiKeysDelete200Response> = api.adminApiKeysDelete(keyId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.adminApiKeysGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adminApiKeysGetTest() {
        val keyId: kotlin.String = TODO()
        
        val response: ResponseEntity<AdminApiKey> = api.adminApiKeysGet(keyId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.adminApiKeysList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adminApiKeysListTest() {
        val after: kotlin.String? = TODO()
        val order: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        
        val response: ResponseEntity<ApiKeyList> = api.adminApiKeysList(after, order, limit)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.archiveProject
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun archiveProjectTest() {
        val projectId: kotlin.String = TODO()
        
        val response: ResponseEntity<Project> = api.archiveProject(projectId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.createProject
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createProjectTest() {
        val projectCreateRequest: ProjectCreateRequest = TODO()
        
        val response: ResponseEntity<Project> = api.createProject(projectCreateRequest)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.createProjectServiceAccount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createProjectServiceAccountTest() {
        val projectId: kotlin.String = TODO()
        val projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest = TODO()
        
        val response: ResponseEntity<ProjectServiceAccountCreateResponse> = api.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.createProjectUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createProjectUserTest() {
        val projectId: kotlin.String = TODO()
        val projectUserCreateRequest: ProjectUserCreateRequest = TODO()
        
        val response: ResponseEntity<ProjectUser> = api.createProjectUser(projectId, projectUserCreateRequest)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.deleteInvite
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteInviteTest() {
        val inviteId: kotlin.String = TODO()
        
        val response: ResponseEntity<InviteDeleteResponse> = api.deleteInvite(inviteId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.deleteProjectApiKey
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteProjectApiKeyTest() {
        val projectId: kotlin.String = TODO()
        val keyId: kotlin.String = TODO()
        
        val response: ResponseEntity<ProjectApiKeyDeleteResponse> = api.deleteProjectApiKey(projectId, keyId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.deleteProjectServiceAccount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteProjectServiceAccountTest() {
        val projectId: kotlin.String = TODO()
        val serviceAccountId: kotlin.String = TODO()
        
        val response: ResponseEntity<ProjectServiceAccountDeleteResponse> = api.deleteProjectServiceAccount(projectId, serviceAccountId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.deleteProjectUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteProjectUserTest() {
        val projectId: kotlin.String = TODO()
        val userId: kotlin.String = TODO()
        
        val response: ResponseEntity<ProjectUserDeleteResponse> = api.deleteProjectUser(projectId, userId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.deleteUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteUserTest() {
        val userId: kotlin.String = TODO()
        
        val response: ResponseEntity<UserDeleteResponse> = api.deleteUser(userId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.inviteUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun inviteUserTest() {
        val inviteRequest: InviteRequest = TODO()
        
        val response: ResponseEntity<Invite> = api.inviteUser(inviteRequest)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.listAuditLogs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listAuditLogsTest() {
        val effectiveAt: ListAuditLogsEffectiveAtParameter? = TODO()
        val projectIds: kotlin.collections.List<kotlin.String>? = TODO()
        val eventTypes: kotlin.collections.List<AuditLogEventType>? = TODO()
        val actorIds: kotlin.collections.List<kotlin.String>? = TODO()
        val actorEmails: kotlin.collections.List<kotlin.String>? = TODO()
        val resourceIds: kotlin.collections.List<kotlin.String>? = TODO()
        val limit: kotlin.Int = TODO()
        val after: kotlin.String? = TODO()
        val before: kotlin.String? = TODO()
        
        val response: ResponseEntity<ListAuditLogsResponse> = api.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.listInvites
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listInvitesTest() {
        val limit: kotlin.Int = TODO()
        val after: kotlin.String? = TODO()
        
        val response: ResponseEntity<InviteListResponse> = api.listInvites(limit, after)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.listProjectApiKeys
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listProjectApiKeysTest() {
        val projectId: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        val after: kotlin.String? = TODO()
        
        val response: ResponseEntity<ProjectApiKeyListResponse> = api.listProjectApiKeys(projectId, limit, after)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.listProjectRateLimits
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listProjectRateLimitsTest() {
        val projectId: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        val after: kotlin.String? = TODO()
        val before: kotlin.String? = TODO()
        
        val response: ResponseEntity<ProjectRateLimitListResponse> = api.listProjectRateLimits(projectId, limit, after, before)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.listProjectServiceAccounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listProjectServiceAccountsTest() {
        val projectId: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        val after: kotlin.String? = TODO()
        
        val response: ResponseEntity<ProjectServiceAccountListResponse> = api.listProjectServiceAccounts(projectId, limit, after)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.listProjectUsers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listProjectUsersTest() {
        val projectId: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        val after: kotlin.String? = TODO()
        
        val response: ResponseEntity<ProjectUserListResponse> = api.listProjectUsers(projectId, limit, after)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.listProjects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listProjectsTest() {
        val limit: kotlin.Int = TODO()
        val after: kotlin.String? = TODO()
        val includeArchived: kotlin.Boolean = TODO()
        
        val response: ResponseEntity<ProjectListResponse> = api.listProjects(limit, after, includeArchived)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.listUsers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listUsersTest() {
        val limit: kotlin.Int = TODO()
        val after: kotlin.String? = TODO()
        
        val response: ResponseEntity<UserListResponse> = api.listUsers(limit, after)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.modifyProject
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun modifyProjectTest() {
        val projectId: kotlin.String = TODO()
        val projectUpdateRequest: ProjectUpdateRequest = TODO()
        
        val response: ResponseEntity<Project> = api.modifyProject(projectId, projectUpdateRequest)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.modifyProjectUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun modifyProjectUserTest() {
        val projectId: kotlin.String = TODO()
        val userId: kotlin.String = TODO()
        val projectUserUpdateRequest: ProjectUserUpdateRequest = TODO()
        
        val response: ResponseEntity<ProjectUser> = api.modifyProjectUser(projectId, userId, projectUserUpdateRequest)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.modifyUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun modifyUserTest() {
        val userId: kotlin.String = TODO()
        val userRoleUpdateRequest: UserRoleUpdateRequest = TODO()
        
        val response: ResponseEntity<User> = api.modifyUser(userId, userRoleUpdateRequest)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.retrieveInvite
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveInviteTest() {
        val inviteId: kotlin.String = TODO()
        
        val response: ResponseEntity<Invite> = api.retrieveInvite(inviteId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.retrieveProject
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveProjectTest() {
        val projectId: kotlin.String = TODO()
        
        val response: ResponseEntity<Project> = api.retrieveProject(projectId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.retrieveProjectApiKey
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveProjectApiKeyTest() {
        val projectId: kotlin.String = TODO()
        val keyId: kotlin.String = TODO()
        
        val response: ResponseEntity<ProjectApiKey> = api.retrieveProjectApiKey(projectId, keyId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.retrieveProjectServiceAccount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveProjectServiceAccountTest() {
        val projectId: kotlin.String = TODO()
        val serviceAccountId: kotlin.String = TODO()
        
        val response: ResponseEntity<ProjectServiceAccount> = api.retrieveProjectServiceAccount(projectId, serviceAccountId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.retrieveProjectUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveProjectUserTest() {
        val projectId: kotlin.String = TODO()
        val userId: kotlin.String = TODO()
        
        val response: ResponseEntity<ProjectUser> = api.retrieveProjectUser(projectId, userId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.retrieveUser
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveUserTest() {
        val userId: kotlin.String = TODO()
        
        val response: ResponseEntity<User> = api.retrieveUser(userId)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.updateProjectRateLimits
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateProjectRateLimitsTest() {
        val projectId: kotlin.String = TODO()
        val rateLimitId: kotlin.String = TODO()
        val projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest = TODO()
        
        val response: ResponseEntity<ProjectRateLimit> = api.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.usageAudioSpeeches
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usageAudioSpeechesTest() {
        val startTime: kotlin.Int = TODO()
        val endTime: kotlin.Int? = TODO()
        val bucketWidth: kotlin.String = TODO()
        val projectIds: kotlin.collections.List<kotlin.String>? = TODO()
        val userIds: kotlin.collections.List<kotlin.String>? = TODO()
        val apiKeyIds: kotlin.collections.List<kotlin.String>? = TODO()
        val models: kotlin.collections.List<kotlin.String>? = TODO()
        val groupBy: kotlin.collections.List<kotlin.String>? = TODO()
        val limit: kotlin.Int? = TODO()
        val page: kotlin.String? = TODO()
        
        val response: ResponseEntity<UsageResponse> = api.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.usageAudioTranscriptions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usageAudioTranscriptionsTest() {
        val startTime: kotlin.Int = TODO()
        val endTime: kotlin.Int? = TODO()
        val bucketWidth: kotlin.String = TODO()
        val projectIds: kotlin.collections.List<kotlin.String>? = TODO()
        val userIds: kotlin.collections.List<kotlin.String>? = TODO()
        val apiKeyIds: kotlin.collections.List<kotlin.String>? = TODO()
        val models: kotlin.collections.List<kotlin.String>? = TODO()
        val groupBy: kotlin.collections.List<kotlin.String>? = TODO()
        val limit: kotlin.Int? = TODO()
        val page: kotlin.String? = TODO()
        
        val response: ResponseEntity<UsageResponse> = api.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.usageCodeInterpreterSessions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usageCodeInterpreterSessionsTest() {
        val startTime: kotlin.Int = TODO()
        val endTime: kotlin.Int? = TODO()
        val bucketWidth: kotlin.String = TODO()
        val projectIds: kotlin.collections.List<kotlin.String>? = TODO()
        val groupBy: kotlin.collections.List<kotlin.String>? = TODO()
        val limit: kotlin.Int? = TODO()
        val page: kotlin.String? = TODO()
        
        val response: ResponseEntity<UsageResponse> = api.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.usageCompletions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usageCompletionsTest() {
        val startTime: kotlin.Int = TODO()
        val endTime: kotlin.Int? = TODO()
        val bucketWidth: kotlin.String = TODO()
        val projectIds: kotlin.collections.List<kotlin.String>? = TODO()
        val userIds: kotlin.collections.List<kotlin.String>? = TODO()
        val apiKeyIds: kotlin.collections.List<kotlin.String>? = TODO()
        val models: kotlin.collections.List<kotlin.String>? = TODO()
        val batch: kotlin.Boolean? = TODO()
        val groupBy: kotlin.collections.List<kotlin.String>? = TODO()
        val limit: kotlin.Int? = TODO()
        val page: kotlin.String? = TODO()
        
        val response: ResponseEntity<UsageResponse> = api.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.usageCosts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usageCostsTest() {
        val startTime: kotlin.Int = TODO()
        val endTime: kotlin.Int? = TODO()
        val bucketWidth: kotlin.String = TODO()
        val projectIds: kotlin.collections.List<kotlin.String>? = TODO()
        val groupBy: kotlin.collections.List<kotlin.String>? = TODO()
        val limit: kotlin.Int = TODO()
        val page: kotlin.String? = TODO()
        
        val response: ResponseEntity<UsageResponse> = api.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.usageEmbeddings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usageEmbeddingsTest() {
        val startTime: kotlin.Int = TODO()
        val endTime: kotlin.Int? = TODO()
        val bucketWidth: kotlin.String = TODO()
        val projectIds: kotlin.collections.List<kotlin.String>? = TODO()
        val userIds: kotlin.collections.List<kotlin.String>? = TODO()
        val apiKeyIds: kotlin.collections.List<kotlin.String>? = TODO()
        val models: kotlin.collections.List<kotlin.String>? = TODO()
        val groupBy: kotlin.collections.List<kotlin.String>? = TODO()
        val limit: kotlin.Int? = TODO()
        val page: kotlin.String? = TODO()
        
        val response: ResponseEntity<UsageResponse> = api.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.usageImages
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usageImagesTest() {
        val startTime: kotlin.Int = TODO()
        val endTime: kotlin.Int? = TODO()
        val bucketWidth: kotlin.String = TODO()
        val sources: kotlin.collections.List<kotlin.String>? = TODO()
        val sizes: kotlin.collections.List<kotlin.String>? = TODO()
        val projectIds: kotlin.collections.List<kotlin.String>? = TODO()
        val userIds: kotlin.collections.List<kotlin.String>? = TODO()
        val apiKeyIds: kotlin.collections.List<kotlin.String>? = TODO()
        val models: kotlin.collections.List<kotlin.String>? = TODO()
        val groupBy: kotlin.collections.List<kotlin.String>? = TODO()
        val limit: kotlin.Int? = TODO()
        val page: kotlin.String? = TODO()
        
        val response: ResponseEntity<UsageResponse> = api.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.usageModerations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usageModerationsTest() {
        val startTime: kotlin.Int = TODO()
        val endTime: kotlin.Int? = TODO()
        val bucketWidth: kotlin.String = TODO()
        val projectIds: kotlin.collections.List<kotlin.String>? = TODO()
        val userIds: kotlin.collections.List<kotlin.String>? = TODO()
        val apiKeyIds: kotlin.collections.List<kotlin.String>? = TODO()
        val models: kotlin.collections.List<kotlin.String>? = TODO()
        val groupBy: kotlin.collections.List<kotlin.String>? = TODO()
        val limit: kotlin.Int? = TODO()
        val page: kotlin.String? = TODO()
        
        val response: ResponseEntity<UsageResponse> = api.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

        // TODO: test validations
    }

    /**
     * To test OrganizationApiController.usageVectorStores
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usageVectorStoresTest() {
        val startTime: kotlin.Int = TODO()
        val endTime: kotlin.Int? = TODO()
        val bucketWidth: kotlin.String = TODO()
        val projectIds: kotlin.collections.List<kotlin.String>? = TODO()
        val groupBy: kotlin.collections.List<kotlin.String>? = TODO()
        val limit: kotlin.Int? = TODO()
        val page: kotlin.String? = TODO()
        
        val response: ResponseEntity<UsageResponse> = api.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

        // TODO: test validations
    }
}
