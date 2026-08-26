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
import org.openapitools.server.api.model.CreateFineTuningJobRequest
import org.openapitools.server.api.model.FineTuningJob
import org.openapitools.server.api.model.ListFineTuningJobCheckpointsResponse
import org.openapitools.server.api.model.ListFineTuningJobEventsResponse
import org.openapitools.server.api.model.ListPaginatedFineTuningJobsResponse

/**
* @TODO("Fill out implementation")
*/
@Singleton
class FineTuningApiAction @Inject constructor(
) : WebAction {

    @Post("/fine_tuning/jobs/{fine_tuning_job_id}/cancel")
    @Description("Immediately cancel a fine-tune job. ")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun cancelFineTuningJob(
        @PathParam("fine_tuning_job_id") fineTuningJobId: kotlin.String
    ): FineTuningJob {
        TODO()
    }

    @Post("/fine_tuning/jobs")
    @Description("Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createFineTuningJob(
        @Valid @RequestBody createFineTuningJobRequest: CreateFineTuningJobRequest
    ): FineTuningJob {
        TODO()
    }

    @Get("/fine_tuning/jobs/{fine_tuning_job_id}/events")
    @Description("Get status updates for a fine-tuning job. ")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listFineTuningEvents(
        @PathParam("fine_tuning_job_id") fineTuningJobId: kotlin.String, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "limit") limit: kotlin.Int
    ): ListFineTuningJobEventsResponse {
        TODO()
    }

    @Get("/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints")
    @Description("List checkpoints for a fine-tuning job. ")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listFineTuningJobCheckpoints(
        @PathParam("fine_tuning_job_id") fineTuningJobId: kotlin.String, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "limit") limit: kotlin.Int
    ): ListFineTuningJobCheckpointsResponse {
        TODO()
    }

    @Get("/fine_tuning/jobs")
    @Description("List your organization's fine-tuning jobs ")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listPaginatedFineTuningJobs(
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "limit") limit: kotlin.Int
    ): ListPaginatedFineTuningJobsResponse {
        TODO()
    }

    @Get("/fine_tuning/jobs/{fine_tuning_job_id}")
    @Description("Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun retrieveFineTuningJob(
        @PathParam("fine_tuning_job_id") fineTuningJobId: kotlin.String
    ): FineTuningJob {
        TODO()
    }
}
