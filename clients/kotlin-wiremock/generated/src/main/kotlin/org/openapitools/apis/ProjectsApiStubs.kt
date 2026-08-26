@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class ProjectsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation archiveProject.
     *
     * @param projectId path parameter projectId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ArchiveProjectStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun archiveProject(projectId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ArchiveProjectStubBuilder =
        ArchiveProjectStubBuilder(objectMapper, post(urlPathTemplate("/organization/projects/{project_id}/archive"))
            .withPathParam("project_id", projectId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createProject.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateProjectStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createProject(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateProjectStubBuilder =
        CreateProjectStubBuilder(objectMapper, post(urlPathTemplate("/organization/projects"))
            .configurer()
        )

    /**
     * Construct a stub for the operation createProjectServiceAccount.
     *
     * @param projectId path parameter projectId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateProjectServiceAccountStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createProjectServiceAccount(projectId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateProjectServiceAccountStubBuilder =
        CreateProjectServiceAccountStubBuilder(objectMapper, post(urlPathTemplate("/organization/projects/{project_id}/service_accounts"))
            .withPathParam("project_id", projectId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createProjectUser.
     *
     * @param projectId path parameter projectId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateProjectUserStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createProjectUser(projectId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateProjectUserStubBuilder =
        CreateProjectUserStubBuilder(objectMapper, post(urlPathTemplate("/organization/projects/{project_id}/users"))
            .withPathParam("project_id", projectId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteProjectApiKey.
     *
     * @param projectId path parameter projectId pattern.
     * @param keyId path parameter keyId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteProjectApiKeyStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteProjectApiKey(projectId: StringValuePattern, keyId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteProjectApiKeyStubBuilder =
        DeleteProjectApiKeyStubBuilder(objectMapper, delete(urlPathTemplate("/organization/projects/{project_id}/api_keys/{key_id}"))
            .withPathParam("project_id", projectId)
            .withPathParam("key_id", keyId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteProjectServiceAccount.
     *
     * @param projectId path parameter projectId pattern.
     * @param serviceAccountId path parameter serviceAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteProjectServiceAccountStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteProjectServiceAccount(projectId: StringValuePattern, serviceAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteProjectServiceAccountStubBuilder =
        DeleteProjectServiceAccountStubBuilder(objectMapper, delete(urlPathTemplate("/organization/projects/{project_id}/service_accounts/{service_account_id}"))
            .withPathParam("project_id", projectId)
            .withPathParam("service_account_id", serviceAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteProjectUser.
     *
     * @param projectId path parameter projectId pattern.
     * @param userId path parameter userId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteProjectUserStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteProjectUser(projectId: StringValuePattern, userId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteProjectUserStubBuilder =
        DeleteProjectUserStubBuilder(objectMapper, delete(urlPathTemplate("/organization/projects/{project_id}/users/{user_id}"))
            .withPathParam("project_id", projectId)
            .withPathParam("user_id", userId)
            .configurer()
        )

    /**
     * Construct a stub for the operation listProjectApiKeys.
     *
     * @param projectId path parameter projectId pattern.
     * @param limit query parameter limit pattern.
     * @param after query parameter after pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListProjectApiKeysStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listProjectApiKeys(projectId: StringValuePattern, limit: StringValuePattern? = null, after: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListProjectApiKeysStubBuilder =
        ListProjectApiKeysStubBuilder(objectMapper, get(urlPathTemplate("/organization/projects/{project_id}/api_keys"))
            .withPathParam("project_id", projectId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listProjectRateLimits.
     *
     * @param projectId path parameter projectId pattern.
     * @param limit query parameter limit pattern.
     * @param after query parameter after pattern.
     * @param before query parameter before pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListProjectRateLimitsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listProjectRateLimits(projectId: StringValuePattern, limit: StringValuePattern? = null, after: StringValuePattern? = null, before: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListProjectRateLimitsStubBuilder =
        ListProjectRateLimitsStubBuilder(objectMapper, get(urlPathTemplate("/organization/projects/{project_id}/rate_limits"))
            .withPathParam("project_id", projectId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { before?.let { withQueryParam("before", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listProjectServiceAccounts.
     *
     * @param projectId path parameter projectId pattern.
     * @param limit query parameter limit pattern.
     * @param after query parameter after pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListProjectServiceAccountsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listProjectServiceAccounts(projectId: StringValuePattern, limit: StringValuePattern? = null, after: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListProjectServiceAccountsStubBuilder =
        ListProjectServiceAccountsStubBuilder(objectMapper, get(urlPathTemplate("/organization/projects/{project_id}/service_accounts"))
            .withPathParam("project_id", projectId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listProjectUsers.
     *
     * @param projectId path parameter projectId pattern.
     * @param limit query parameter limit pattern.
     * @param after query parameter after pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListProjectUsersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listProjectUsers(projectId: StringValuePattern, limit: StringValuePattern? = null, after: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListProjectUsersStubBuilder =
        ListProjectUsersStubBuilder(objectMapper, get(urlPathTemplate("/organization/projects/{project_id}/users"))
            .withPathParam("project_id", projectId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listProjects.
     *
     * @param limit query parameter limit pattern.
     * @param after query parameter after pattern.
     * @param includeArchived query parameter includeArchived pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListProjectsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listProjects(limit: StringValuePattern? = null, after: StringValuePattern? = null, includeArchived: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListProjectsStubBuilder =
        ListProjectsStubBuilder(objectMapper, get(urlPathTemplate("/organization/projects"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { includeArchived?.let { withQueryParam("include_archived", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation modifyProject.
     *
     * @param projectId path parameter projectId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ModifyProjectStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun modifyProject(projectId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ModifyProjectStubBuilder =
        ModifyProjectStubBuilder(objectMapper, post(urlPathTemplate("/organization/projects/{project_id}"))
            .withPathParam("project_id", projectId)
            .configurer()
        )

    /**
     * Construct a stub for the operation modifyProjectUser.
     *
     * @param projectId path parameter projectId pattern.
     * @param userId path parameter userId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ModifyProjectUserStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun modifyProjectUser(projectId: StringValuePattern, userId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ModifyProjectUserStubBuilder =
        ModifyProjectUserStubBuilder(objectMapper, post(urlPathTemplate("/organization/projects/{project_id}/users/{user_id}"))
            .withPathParam("project_id", projectId)
            .withPathParam("user_id", userId)
            .configurer()
        )

    /**
     * Construct a stub for the operation retrieveProject.
     *
     * @param projectId path parameter projectId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RetrieveProjectStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun retrieveProject(projectId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RetrieveProjectStubBuilder =
        RetrieveProjectStubBuilder(objectMapper, get(urlPathTemplate("/organization/projects/{project_id}"))
            .withPathParam("project_id", projectId)
            .configurer()
        )

    /**
     * Construct a stub for the operation retrieveProjectApiKey.
     *
     * @param projectId path parameter projectId pattern.
     * @param keyId path parameter keyId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RetrieveProjectApiKeyStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun retrieveProjectApiKey(projectId: StringValuePattern, keyId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RetrieveProjectApiKeyStubBuilder =
        RetrieveProjectApiKeyStubBuilder(objectMapper, get(urlPathTemplate("/organization/projects/{project_id}/api_keys/{key_id}"))
            .withPathParam("project_id", projectId)
            .withPathParam("key_id", keyId)
            .configurer()
        )

    /**
     * Construct a stub for the operation retrieveProjectServiceAccount.
     *
     * @param projectId path parameter projectId pattern.
     * @param serviceAccountId path parameter serviceAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RetrieveProjectServiceAccountStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun retrieveProjectServiceAccount(projectId: StringValuePattern, serviceAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RetrieveProjectServiceAccountStubBuilder =
        RetrieveProjectServiceAccountStubBuilder(objectMapper, get(urlPathTemplate("/organization/projects/{project_id}/service_accounts/{service_account_id}"))
            .withPathParam("project_id", projectId)
            .withPathParam("service_account_id", serviceAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation retrieveProjectUser.
     *
     * @param projectId path parameter projectId pattern.
     * @param userId path parameter userId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RetrieveProjectUserStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun retrieveProjectUser(projectId: StringValuePattern, userId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RetrieveProjectUserStubBuilder =
        RetrieveProjectUserStubBuilder(objectMapper, get(urlPathTemplate("/organization/projects/{project_id}/users/{user_id}"))
            .withPathParam("project_id", projectId)
            .withPathParam("user_id", userId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateProjectRateLimits.
     *
     * @param projectId path parameter projectId pattern.
     * @param rateLimitId path parameter rateLimitId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateProjectRateLimitsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateProjectRateLimits(projectId: StringValuePattern, rateLimitId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateProjectRateLimitsStubBuilder =
        UpdateProjectRateLimitsStubBuilder(objectMapper, post(urlPathTemplate("/organization/projects/{project_id}/rate_limits/{rate_limit_id}"))
            .withPathParam("project_id", projectId)
            .withPathParam("rate_limit_id", rateLimitId)
            .configurer()
        )
}
