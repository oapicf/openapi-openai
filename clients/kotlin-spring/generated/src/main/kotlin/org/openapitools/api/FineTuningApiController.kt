package org.openapitools.api

import org.openapitools.model.CreateFineTuningJobRequest
import org.openapitools.model.FineTuningJob
import org.openapitools.model.ListFineTuningJobCheckpointsResponse
import org.openapitools.model.ListFineTuningJobEventsResponse
import org.openapitools.model.ListPaginatedFineTuningJobsResponse
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired
import org.openapitools.api.FineTuningApiController.Companion.BASE_PATH

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${openapi.openAI.base-path:\${api.base-path:$BASE_PATH}}")
class FineTuningApiController() {

    @Operation(
        summary = "Immediately cancel a fine-tune job. ",
        operationId = "cancelFineTuningJob",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = FineTuningJob::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CANCEL_FINE_TUNING_JOB /* "/fine_tuning/jobs/{fine_tuning_job_id}/cancel" */],
        produces = ["application/json"]
    )
    fun cancelFineTuningJob(
        @Parameter(description = "The ID of the fine-tuning job to cancel. ", required = true) @PathVariable("fine_tuning_job_id") fineTuningJobId: kotlin.String
    ): ResponseEntity<FineTuningJob> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ",
        operationId = "createFineTuningJob",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = FineTuningJob::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_FINE_TUNING_JOB /* "/fine_tuning/jobs" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createFineTuningJob(
        @Parameter(description = "", required = true) @Valid @RequestBody createFineTuningJobRequest: CreateFineTuningJobRequest
    ): ResponseEntity<FineTuningJob> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get status updates for a fine-tuning job. ",
        operationId = "listFineTuningEvents",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListFineTuningJobEventsResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_FINE_TUNING_EVENTS /* "/fine_tuning/jobs/{fine_tuning_job_id}/events" */],
        produces = ["application/json"]
    )
    fun listFineTuningEvents(
        @Parameter(description = "The ID of the fine-tuning job to get events for. ", required = true) @PathVariable("fine_tuning_job_id") fineTuningJobId: kotlin.String,
        @Parameter(description = "Identifier for the last event from the previous pagination request.") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "Number of events to retrieve.", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<ListFineTuningJobEventsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List checkpoints for a fine-tuning job. ",
        operationId = "listFineTuningJobCheckpoints",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListFineTuningJobCheckpointsResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_FINE_TUNING_JOB_CHECKPOINTS /* "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints" */],
        produces = ["application/json"]
    )
    fun listFineTuningJobCheckpoints(
        @Parameter(description = "The ID of the fine-tuning job to get checkpoints for. ", required = true) @PathVariable("fine_tuning_job_id") fineTuningJobId: kotlin.String,
        @Parameter(description = "Identifier for the last checkpoint ID from the previous pagination request.") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "Number of checkpoints to retrieve.", schema = Schema(defaultValue = "10")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") limit: kotlin.Int
    ): ResponseEntity<ListFineTuningJobCheckpointsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List your organization's fine-tuning jobs ",
        operationId = "listPaginatedFineTuningJobs",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListPaginatedFineTuningJobsResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_PAGINATED_FINE_TUNING_JOBS /* "/fine_tuning/jobs" */],
        produces = ["application/json"]
    )
    fun listPaginatedFineTuningJobs(
        @Parameter(description = "Identifier for the last job from the previous pagination request.") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "Number of fine-tuning jobs to retrieve.", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<ListPaginatedFineTuningJobsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ",
        operationId = "retrieveFineTuningJob",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = FineTuningJob::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_RETRIEVE_FINE_TUNING_JOB /* "/fine_tuning/jobs/{fine_tuning_job_id}" */],
        produces = ["application/json"]
    )
    fun retrieveFineTuningJob(
        @Parameter(description = "The ID of the fine-tuning job. ", required = true) @PathVariable("fine_tuning_job_id") fineTuningJobId: kotlin.String
    ): ResponseEntity<FineTuningJob> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v1"
        const val PATH_CANCEL_FINE_TUNING_JOB: String = "/fine_tuning/jobs/{fine_tuning_job_id}/cancel"
        const val PATH_CREATE_FINE_TUNING_JOB: String = "/fine_tuning/jobs"
        const val PATH_LIST_FINE_TUNING_EVENTS: String = "/fine_tuning/jobs/{fine_tuning_job_id}/events"
        const val PATH_LIST_FINE_TUNING_JOB_CHECKPOINTS: String = "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints"
        const val PATH_LIST_PAGINATED_FINE_TUNING_JOBS: String = "/fine_tuning/jobs"
        const val PATH_RETRIEVE_FINE_TUNING_JOB: String = "/fine_tuning/jobs/{fine_tuning_job_id}"
    }
}
