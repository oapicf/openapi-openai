package org.openapitools.api

import org.openapitools.model.CreateFineTuneRequest
import org.openapitools.model.FineTune
import org.openapitools.model.ListFineTuneEventsResponse
import org.openapitools.model.ListFineTunesResponse
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
@RequestMapping("\${api.base-path:/v1}")
class FineTunesApiController() {

    @Operation(
        summary = "Immediately cancel a fine-tune job. ",
        operationId = "cancelFineTune",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = FineTune::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/fine-tunes/{fine_tune_id}/cancel"],
        produces = ["application/json"]
    )
    fun cancelFineTune(@Parameter(description = "The ID of the fine-tune job to cancel ", required = true) @PathVariable("fine_tune_id") fineTuneId: kotlin.String): ResponseEntity<FineTune> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ",
        operationId = "createFineTune",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = FineTune::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/fine-tunes"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createFineTune(@Parameter(description = "", required = true) @Valid @RequestBody createFineTuneRequest: CreateFineTuneRequest): ResponseEntity<FineTune> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get fine-grained status updates for a fine-tune job. ",
        operationId = "listFineTuneEvents",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListFineTuneEventsResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/fine-tunes/{fine_tune_id}/events"],
        produces = ["application/json"]
    )
    fun listFineTuneEvents(@Parameter(description = "The ID of the fine-tune job to get events for. ", required = true) @PathVariable("fine_tune_id") fineTuneId: kotlin.String,@Parameter(description = "Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. ", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "stream", required = false, defaultValue = "false") stream: kotlin.Boolean): ResponseEntity<ListFineTuneEventsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List your organization's fine-tuning jobs ",
        operationId = "listFineTunes",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListFineTunesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/fine-tunes"],
        produces = ["application/json"]
    )
    fun listFineTunes(): ResponseEntity<ListFineTunesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ",
        operationId = "retrieveFineTune",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = FineTune::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/fine-tunes/{fine_tune_id}"],
        produces = ["application/json"]
    )
    fun retrieveFineTune(@Parameter(description = "The ID of the fine-tune job ", required = true) @PathVariable("fine_tune_id") fineTuneId: kotlin.String): ResponseEntity<FineTune> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
