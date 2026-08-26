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
import org.openapitools.server.api.model.AdminApiKey
import org.openapitools.server.api.model.AdminApiKeysCreateRequest
import org.openapitools.server.api.model.AdminApiKeysDelete200Response
import org.openapitools.server.api.model.ApiKeyList

/**
* @TODO("Fill out implementation")
*/
@Singleton
class DefaultApiAction @Inject constructor(
) : WebAction {

    @Post("/organization/admin_api_keys")
    @Description("Create an organization admin API key")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adminApiKeysCreate(
        @Valid @RequestBody adminApiKeysCreateRequest: AdminApiKeysCreateRequest
    ): AdminApiKey {
        TODO()
    }

    @Delete("/organization/admin_api_keys/{key_id}")
    @Description("Delete an organization admin API key")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adminApiKeysDelete(
        @PathParam("key_id") keyId: kotlin.String
    ): AdminApiKeysDelete200Response {
        TODO()
    }

    @Get("/organization/admin_api_keys/{key_id}")
    @Description("Retrieve a single organization API key")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adminApiKeysGet(
        @PathParam("key_id") keyId: kotlin.String
    ): AdminApiKey {
        TODO()
    }

    @Get("/organization/admin_api_keys")
    @Description("List organization API keys")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun adminApiKeysList(
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "order") order: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int
    ): ApiKeyList {
        TODO()
    }
}
