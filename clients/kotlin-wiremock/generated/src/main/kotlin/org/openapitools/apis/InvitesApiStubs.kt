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
open class InvitesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation deleteInvite.
     *
     * @param inviteId path parameter inviteId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteInviteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteInvite(inviteId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteInviteStubBuilder =
        DeleteInviteStubBuilder(objectMapper, delete(urlPathTemplate("/organization/invites/{invite_id}"))
            .withPathParam("invite_id", inviteId)
            .configurer()
        )

    /**
     * Construct a stub for the operation inviteUser.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [InviteUserStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun inviteUser(configurer: MappingBuilder.() -> MappingBuilder = { this }): InviteUserStubBuilder =
        InviteUserStubBuilder(objectMapper, post(urlPathTemplate("/organization/invites"))
            .configurer()
        )

    /**
     * Construct a stub for the operation listInvites.
     *
     * @param limit query parameter limit pattern.
     * @param after query parameter after pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListInvitesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listInvites(limit: StringValuePattern? = null, after: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListInvitesStubBuilder =
        ListInvitesStubBuilder(objectMapper, get(urlPathTemplate("/organization/invites"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation retrieveInvite.
     *
     * @param inviteId path parameter inviteId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RetrieveInviteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun retrieveInvite(inviteId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RetrieveInviteStubBuilder =
        RetrieveInviteStubBuilder(objectMapper, get(urlPathTemplate("/organization/invites/{invite_id}"))
            .withPathParam("invite_id", inviteId)
            .configurer()
        )
}
