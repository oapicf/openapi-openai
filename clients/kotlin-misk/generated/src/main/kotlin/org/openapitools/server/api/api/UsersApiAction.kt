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
import org.openapitools.server.api.model.User
import org.openapitools.server.api.model.UserDeleteResponse
import org.openapitools.server.api.model.UserListResponse
import org.openapitools.server.api.model.UserRoleUpdateRequest

/**
* @TODO("Fill out implementation")
*/
@Singleton
class UsersApiAction @Inject constructor(
) : WebAction {

    @Delete("/organization/users/{user_id}")
    @Description("Deletes a user from the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteUser(
        @PathParam("user_id") userId: kotlin.String
    ): UserDeleteResponse {
        TODO()
    }

    @Get("/organization/users")
    @Description("Lists all of the users in the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listUsers(
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "after") after: kotlin.String?
    ): UserListResponse {
        TODO()
    }

    @Post("/organization/users/{user_id}")
    @Description("Modifies a user's role in the organization.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun modifyUser(
        @PathParam("user_id") userId: kotlin.String, 
        @Valid @RequestBody userRoleUpdateRequest: UserRoleUpdateRequest
    ): User {
        TODO()
    }

    @Get("/organization/users/{user_id}")
    @Description("Retrieves a user by their identifier.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun retrieveUser(
        @PathParam("user_id") userId: kotlin.String
    ): User {
        TODO()
    }
}
