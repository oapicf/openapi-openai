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
import org.openapitools.server.api.model.DeleteModelResponse
import org.openapitools.server.api.model.ListModelsResponse
import org.openapitools.server.api.model.Model

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ModelsApiAction @Inject constructor(
) : WebAction {

    @Delete("/models/{model}")
    @Description("Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteModel(
        @PathParam("model") model: kotlin.String
    ): DeleteModelResponse {
        TODO()
    }

    @Get("/models")
    @Description("Lists the currently available models, and provides basic information about each one such as the owner and availability.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listModels(
    ): ListModelsResponse {
        TODO()
    }

    @Get("/models/{model}")
    @Description("Retrieves a model instance, providing basic information about the model such as the owner and permissioning.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun retrieveModel(
        @PathParam("model") model: kotlin.String
    ): Model {
        TODO()
    }
}
