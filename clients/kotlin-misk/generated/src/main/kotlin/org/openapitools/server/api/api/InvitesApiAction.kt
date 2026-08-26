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
import org.openapitools.server.api.model.Invite
import org.openapitools.server.api.model.InviteDeleteResponse
import org.openapitools.server.api.model.InviteListResponse
import org.openapitools.server.api.model.InviteRequest

/**
* @TODO("Fill out implementation")
*/
@Singleton
class InvitesApiAction @Inject constructor(
) : WebAction {

    @Delete("/organization/invites/{invite_id}")
    @Description("Delete an invite. If the invite has already been accepted, it cannot be deleted.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteInvite(
        @PathParam("invite_id") inviteId: kotlin.String
    ): InviteDeleteResponse {
        TODO()
    }

    @Post("/organization/invites")
    @Description("Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun inviteUser(
        @Valid @RequestBody inviteRequest: InviteRequest
    ): Invite {
        TODO()
    }

    @Get("/organization/invites")
    @Description("Returns a list of invites in the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listInvites(
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "after") after: kotlin.String?
    ): InviteListResponse {
        TODO()
    }

    @Get("/organization/invites/{invite_id}")
    @Description("Retrieves an invite.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun retrieveInvite(
        @PathParam("invite_id") inviteId: kotlin.String
    ): Invite {
        TODO()
    }
}
