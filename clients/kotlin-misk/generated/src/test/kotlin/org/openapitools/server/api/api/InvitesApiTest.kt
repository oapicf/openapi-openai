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
import org.openapitools.server.api.model.Invite
import org.openapitools.server.api.model.InviteDeleteResponse
import org.openapitools.server.api.model.InviteListResponse
import org.openapitools.server.api.model.InviteRequest

@MiskTest(startService = true)
internal class InvitesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var invitesApi: InvitesApiAction

    /**
     * To test InvitesApiAction.deleteInvite
     */
    @Test
    fun `should handle deleteInvite`() {
        val inviteId = TODO()
        val response: InviteDeleteResponse = invitesApi.deleteInvite(inviteId)
    }

    /**
     * To test InvitesApiAction.inviteUser
     */
    @Test
    fun `should handle inviteUser`() {
        val inviteRequest = TODO()
        val response: Invite = invitesApi.inviteUser(inviteRequest)
    }

    /**
     * To test InvitesApiAction.listInvites
     */
    @Test
    fun `should handle listInvites`() {
        val limit = TODO()
        val after = TODO()
        val response: InviteListResponse = invitesApi.listInvites(limit, after)
    }

    /**
     * To test InvitesApiAction.retrieveInvite
     */
    @Test
    fun `should handle retrieveInvite`() {
        val inviteId = TODO()
        val response: Invite = invitesApi.retrieveInvite(inviteId)
    }
}
