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
import org.openapitools.server.api.model.UsageResponse

/**
* @TODO("Fill out implementation")
*/
@Singleton
class UsageApiAction @Inject constructor(
) : WebAction {

    @Get("/organization/usage/audio_speeches")
    @Description("Get audio speeches usage details for the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun usageAudioSpeeches(
         @QueryParam(value = "start_time") startTime: kotlin.Int, 
         @QueryParam(value = "end_time") endTime: kotlin.Int?, 
         @QueryParam(value = "bucket_width") bucketWidth: kotlin.String, 
         @QueryParam(value = "project_ids") projectIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "user_ids") userIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "api_key_ids") apiKeyIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "models") models: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "group_by") groupBy: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "page") page: kotlin.String?
    ): UsageResponse {
        TODO()
    }

    @Get("/organization/usage/audio_transcriptions")
    @Description("Get audio transcriptions usage details for the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun usageAudioTranscriptions(
         @QueryParam(value = "start_time") startTime: kotlin.Int, 
         @QueryParam(value = "end_time") endTime: kotlin.Int?, 
         @QueryParam(value = "bucket_width") bucketWidth: kotlin.String, 
         @QueryParam(value = "project_ids") projectIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "user_ids") userIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "api_key_ids") apiKeyIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "models") models: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "group_by") groupBy: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "page") page: kotlin.String?
    ): UsageResponse {
        TODO()
    }

    @Get("/organization/usage/code_interpreter_sessions")
    @Description("Get code interpreter sessions usage details for the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun usageCodeInterpreterSessions(
         @QueryParam(value = "start_time") startTime: kotlin.Int, 
         @QueryParam(value = "end_time") endTime: kotlin.Int?, 
         @QueryParam(value = "bucket_width") bucketWidth: kotlin.String, 
         @QueryParam(value = "project_ids") projectIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "group_by") groupBy: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "page") page: kotlin.String?
    ): UsageResponse {
        TODO()
    }

    @Get("/organization/usage/completions")
    @Description("Get completions usage details for the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun usageCompletions(
         @QueryParam(value = "start_time") startTime: kotlin.Int, 
         @QueryParam(value = "end_time") endTime: kotlin.Int?, 
         @QueryParam(value = "bucket_width") bucketWidth: kotlin.String, 
         @QueryParam(value = "project_ids") projectIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "user_ids") userIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "api_key_ids") apiKeyIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "models") models: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "batch") batch: kotlin.Boolean?, 
         @QueryParam(value = "group_by") groupBy: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "page") page: kotlin.String?
    ): UsageResponse {
        TODO()
    }

    @Get("/organization/costs")
    @Description("Get costs details for the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun usageCosts(
         @QueryParam(value = "start_time") startTime: kotlin.Int, 
         @QueryParam(value = "end_time") endTime: kotlin.Int?, 
         @QueryParam(value = "bucket_width") bucketWidth: kotlin.String, 
         @QueryParam(value = "project_ids") projectIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "group_by") groupBy: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "page") page: kotlin.String?
    ): UsageResponse {
        TODO()
    }

    @Get("/organization/usage/embeddings")
    @Description("Get embeddings usage details for the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun usageEmbeddings(
         @QueryParam(value = "start_time") startTime: kotlin.Int, 
         @QueryParam(value = "end_time") endTime: kotlin.Int?, 
         @QueryParam(value = "bucket_width") bucketWidth: kotlin.String, 
         @QueryParam(value = "project_ids") projectIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "user_ids") userIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "api_key_ids") apiKeyIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "models") models: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "group_by") groupBy: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "page") page: kotlin.String?
    ): UsageResponse {
        TODO()
    }

    @Get("/organization/usage/images")
    @Description("Get images usage details for the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun usageImages(
         @QueryParam(value = "start_time") startTime: kotlin.Int, 
         @QueryParam(value = "end_time") endTime: kotlin.Int?, 
         @QueryParam(value = "bucket_width") bucketWidth: kotlin.String, 
         @QueryParam(value = "sources") sources: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "sizes") sizes: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "project_ids") projectIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "user_ids") userIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "api_key_ids") apiKeyIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "models") models: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "group_by") groupBy: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "page") page: kotlin.String?
    ): UsageResponse {
        TODO()
    }

    @Get("/organization/usage/moderations")
    @Description("Get moderations usage details for the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun usageModerations(
         @QueryParam(value = "start_time") startTime: kotlin.Int, 
         @QueryParam(value = "end_time") endTime: kotlin.Int?, 
         @QueryParam(value = "bucket_width") bucketWidth: kotlin.String, 
         @QueryParam(value = "project_ids") projectIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "user_ids") userIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "api_key_ids") apiKeyIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "models") models: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "group_by") groupBy: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "page") page: kotlin.String?
    ): UsageResponse {
        TODO()
    }

    @Get("/organization/usage/vector_stores")
    @Description("Get vector stores usage details for the organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun usageVectorStores(
         @QueryParam(value = "start_time") startTime: kotlin.Int, 
         @QueryParam(value = "end_time") endTime: kotlin.Int?, 
         @QueryParam(value = "bucket_width") bucketWidth: kotlin.String, 
         @QueryParam(value = "project_ids") projectIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "group_by") groupBy: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "page") page: kotlin.String?
    ): UsageResponse {
        TODO()
    }
}
