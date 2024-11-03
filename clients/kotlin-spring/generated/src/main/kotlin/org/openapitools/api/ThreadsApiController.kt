package org.openapitools.api

import org.openapitools.model.CreateMessageRequest
import org.openapitools.model.CreateRunRequest
import org.openapitools.model.CreateThreadAndRunRequest
import org.openapitools.model.CreateThreadRequest
import org.openapitools.model.DeleteThreadResponse
import org.openapitools.model.ListMessageFilesResponse
import org.openapitools.model.ListMessagesResponse
import org.openapitools.model.ListRunStepsResponse
import org.openapitools.model.ListRunsResponse
import org.openapitools.model.MessageFileObject
import org.openapitools.model.MessageObject
import org.openapitools.model.ModifyMessageRequest
import org.openapitools.model.ModifyRunRequest
import org.openapitools.model.ModifyThreadRequest
import org.openapitools.model.RunObject
import org.openapitools.model.RunStepObject
import org.openapitools.model.SubmitToolOutputsRunRequest
import org.openapitools.model.ThreadObject
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
class ThreadsApiController() {

    @Operation(
        summary = "Cancels a run that is `in_progress`.",
        operationId = "cancelRun",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = RunObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/threads/{thread_id}/runs/{run_id}/cancel"],
        produces = ["application/json"]
    )
    fun cancelRun(@Parameter(description = "The ID of the thread to which this run belongs.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "The ID of the run to cancel.", required = true) @PathVariable("run_id") runId: kotlin.String): ResponseEntity<RunObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a message.",
        operationId = "createMessage",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = MessageObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/threads/{thread_id}/messages"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createMessage(@Parameter(description = "The ID of the [thread](/docs/api-reference/threads) to create a message for.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody createMessageRequest: CreateMessageRequest): ResponseEntity<MessageObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a run.",
        operationId = "createRun",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = RunObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/threads/{thread_id}/runs"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createRun(@Parameter(description = "The ID of the thread to run.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody createRunRequest: CreateRunRequest): ResponseEntity<RunObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a thread.",
        operationId = "createThread",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ThreadObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/threads"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createThread(@Parameter(description = "") @Valid @RequestBody(required = false) createThreadRequest: CreateThreadRequest?): ResponseEntity<ThreadObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a thread and run it in one request.",
        operationId = "createThreadAndRun",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = RunObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/threads/runs"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createThreadAndRun(@Parameter(description = "", required = true) @Valid @RequestBody createThreadAndRunRequest: CreateThreadAndRunRequest): ResponseEntity<RunObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete a thread.",
        operationId = "deleteThread",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = DeleteThreadResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/threads/{thread_id}"],
        produces = ["application/json"]
    )
    fun deleteThread(@Parameter(description = "The ID of the thread to delete.", required = true) @PathVariable("thread_id") threadId: kotlin.String): ResponseEntity<DeleteThreadResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieve a message.",
        operationId = "getMessage",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = MessageObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/threads/{thread_id}/messages/{message_id}"],
        produces = ["application/json"]
    )
    fun getMessage(@Parameter(description = "The ID of the [thread](/docs/api-reference/threads) to which this message belongs.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "The ID of the message to retrieve.", required = true) @PathVariable("message_id") messageId: kotlin.String): ResponseEntity<MessageObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a message file.",
        operationId = "getMessageFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = MessageFileObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/threads/{thread_id}/messages/{message_id}/files/{file_id}"],
        produces = ["application/json"]
    )
    fun getMessageFile(@Parameter(description = "The ID of the thread to which the message and File belong.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "The ID of the message the file belongs to.", required = true) @PathVariable("message_id") messageId: kotlin.String,@Parameter(description = "The ID of the file being retrieved.", required = true) @PathVariable("file_id") fileId: kotlin.String): ResponseEntity<MessageFileObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a run.",
        operationId = "getRun",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = RunObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/threads/{thread_id}/runs/{run_id}"],
        produces = ["application/json"]
    )
    fun getRun(@Parameter(description = "The ID of the [thread](/docs/api-reference/threads) that was run.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "The ID of the run to retrieve.", required = true) @PathVariable("run_id") runId: kotlin.String): ResponseEntity<RunObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a run step.",
        operationId = "getRunStep",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = RunStepObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/threads/{thread_id}/runs/{run_id}/steps/{step_id}"],
        produces = ["application/json"]
    )
    fun getRunStep(@Parameter(description = "The ID of the thread to which the run and run step belongs.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "The ID of the run to which the run step belongs.", required = true) @PathVariable("run_id") runId: kotlin.String,@Parameter(description = "The ID of the run step to retrieve.", required = true) @PathVariable("step_id") stepId: kotlin.String): ResponseEntity<RunStepObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a thread.",
        operationId = "getThread",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ThreadObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/threads/{thread_id}"],
        produces = ["application/json"]
    )
    fun getThread(@Parameter(description = "The ID of the thread to retrieve.", required = true) @PathVariable("thread_id") threadId: kotlin.String): ResponseEntity<ThreadObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of message files.",
        operationId = "listMessageFiles",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListMessageFilesResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/threads/{thread_id}/messages/{message_id}/files"],
        produces = ["application/json"]
    )
    fun listMessageFiles(@Parameter(description = "The ID of the thread that the message and files belong to.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "The ID of the message that the files belongs to.", required = true) @PathVariable("message_id") messageId: kotlin.String,@Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,@Parameter(description = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", schema = Schema(allowableValues = ["asc", "desc"], defaultValue = "desc")) @Valid @RequestParam(value = "order", required = false, defaultValue = "desc") order: kotlin.String,@Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,@Parameter(description = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @Valid @RequestParam(value = "before", required = false) before: kotlin.String?): ResponseEntity<ListMessageFilesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of messages for a given thread.",
        operationId = "listMessages",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListMessagesResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/threads/{thread_id}/messages"],
        produces = ["application/json"]
    )
    fun listMessages(@Parameter(description = "The ID of the [thread](/docs/api-reference/threads) the messages belong to.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,@Parameter(description = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", schema = Schema(allowableValues = ["asc", "desc"], defaultValue = "desc")) @Valid @RequestParam(value = "order", required = false, defaultValue = "desc") order: kotlin.String,@Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,@Parameter(description = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @Valid @RequestParam(value = "before", required = false) before: kotlin.String?,@Parameter(description = "Filter messages by the run ID that generated them. ") @Valid @RequestParam(value = "run_id", required = false) runId: kotlin.String?): ResponseEntity<ListMessagesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of run steps belonging to a run.",
        operationId = "listRunSteps",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListRunStepsResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/threads/{thread_id}/runs/{run_id}/steps"],
        produces = ["application/json"]
    )
    fun listRunSteps(@Parameter(description = "The ID of the thread the run and run steps belong to.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "The ID of the run the run steps belong to.", required = true) @PathVariable("run_id") runId: kotlin.String,@Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,@Parameter(description = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", schema = Schema(allowableValues = ["asc", "desc"], defaultValue = "desc")) @Valid @RequestParam(value = "order", required = false, defaultValue = "desc") order: kotlin.String,@Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,@Parameter(description = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @Valid @RequestParam(value = "before", required = false) before: kotlin.String?): ResponseEntity<ListRunStepsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of runs belonging to a thread.",
        operationId = "listRuns",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListRunsResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/threads/{thread_id}/runs"],
        produces = ["application/json"]
    )
    fun listRuns(@Parameter(description = "The ID of the thread the run belongs to.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,@Parameter(description = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", schema = Schema(allowableValues = ["asc", "desc"], defaultValue = "desc")) @Valid @RequestParam(value = "order", required = false, defaultValue = "desc") order: kotlin.String,@Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,@Parameter(description = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @Valid @RequestParam(value = "before", required = false) before: kotlin.String?): ResponseEntity<ListRunsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Modifies a message.",
        operationId = "modifyMessage",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = MessageObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/threads/{thread_id}/messages/{message_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun modifyMessage(@Parameter(description = "The ID of the thread to which this message belongs.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "The ID of the message to modify.", required = true) @PathVariable("message_id") messageId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody modifyMessageRequest: ModifyMessageRequest): ResponseEntity<MessageObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Modifies a run.",
        operationId = "modifyRun",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = RunObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/threads/{thread_id}/runs/{run_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun modifyRun(@Parameter(description = "The ID of the [thread](/docs/api-reference/threads) that was run.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "The ID of the run to modify.", required = true) @PathVariable("run_id") runId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody modifyRunRequest: ModifyRunRequest): ResponseEntity<RunObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Modifies a thread.",
        operationId = "modifyThread",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ThreadObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/threads/{thread_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun modifyThread(@Parameter(description = "The ID of the thread to modify. Only the `metadata` can be modified.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody modifyThreadRequest: ModifyThreadRequest): ResponseEntity<ThreadObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. ",
        operationId = "submitToolOuputsToRun",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = RunObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/threads/{thread_id}/runs/{run_id}/submit_tool_outputs"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun submitToolOuputsToRun(@Parameter(description = "The ID of the [thread](/docs/api-reference/threads) to which this run belongs.", required = true) @PathVariable("thread_id") threadId: kotlin.String,@Parameter(description = "The ID of the run that requires the tool output submission.", required = true) @PathVariable("run_id") runId: kotlin.String,@Parameter(description = "", required = true) @Valid @RequestBody submitToolOutputsRunRequest: SubmitToolOutputsRunRequest): ResponseEntity<RunObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
