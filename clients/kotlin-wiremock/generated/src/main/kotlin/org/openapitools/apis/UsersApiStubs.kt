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
open class UsersApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation deleteUser.
     *
     * @param userId path parameter userId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteUserStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteUser(userId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteUserStubBuilder =
        DeleteUserStubBuilder(objectMapper, delete(urlPathTemplate("/organization/users/{user_id}"))
            .withPathParam("user_id", userId)
            .configurer()
        )

    /**
     * Construct a stub for the operation listUsers.
     *
     * @param limit query parameter limit pattern.
     * @param after query parameter after pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListUsersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listUsers(limit: StringValuePattern? = null, after: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListUsersStubBuilder =
        ListUsersStubBuilder(objectMapper, get(urlPathTemplate("/organization/users"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation modifyUser.
     *
     * @param userId path parameter userId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ModifyUserStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun modifyUser(userId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ModifyUserStubBuilder =
        ModifyUserStubBuilder(objectMapper, post(urlPathTemplate("/organization/users/{user_id}"))
            .withPathParam("user_id", userId)
            .configurer()
        )

    /**
     * Construct a stub for the operation retrieveUser.
     *
     * @param userId path parameter userId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RetrieveUserStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun retrieveUser(userId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RetrieveUserStubBuilder =
        RetrieveUserStubBuilder(objectMapper, get(urlPathTemplate("/organization/users/{user_id}"))
            .withPathParam("user_id", userId)
            .configurer()
        )
}
