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
import org.openapitools.server.api.model.Batch
import org.openapitools.server.api.model.CreateBatchRequest
import org.openapitools.server.api.model.ListBatchesResponse

/**
* @TODO("Fill out implementation")
*/
@Singleton
class BatchApiAction @Inject constructor(
) : WebAction {

    @Post("/batches/{batch_id}/cancel")
    @Description("Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun cancelBatch(
        @PathParam("batch_id") batchId: kotlin.String
    ): Batch {
        TODO()
    }

    @Post("/batches")
    @Description("Creates and executes a batch from an uploaded file of requests")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createBatch(
        @Valid @RequestBody createBatchRequest: CreateBatchRequest
    ): Batch {
        TODO()
    }

    @Get("/batches")
    @Description("List your organization's batches.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listBatches(
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "limit") limit: kotlin.Int
    ): ListBatchesResponse {
        TODO()
    }

    @Get("/batches/{batch_id}")
    @Description("Retrieves a batch.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun retrieveBatch(
        @PathParam("batch_id") batchId: kotlin.String
    ): Batch {
        TODO()
    }
}
