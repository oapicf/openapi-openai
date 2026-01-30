package org.openapitools.api

import org.openapitools.model.AssistantObject
import org.openapitools.model.CreateAssistantRequest
import org.openapitools.model.DeleteAssistantResponse
import org.openapitools.model.ListAssistantsResponse
import org.openapitools.model.ModifyAssistantRequest
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
import org.openapitools.api.AssistantsApiController.Companion.BASE_PATH

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
class AssistantsApiController() {

    @Operation(
        summary = "Create an assistant with a model and instructions.",
        operationId = "createAssistant",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = AssistantObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_ASSISTANT /* "/assistants" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createAssistant(
        @Parameter(description = "", required = true) @Valid @RequestBody createAssistantRequest: CreateAssistantRequest
    ): ResponseEntity<AssistantObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete an assistant.",
        operationId = "deleteAssistant",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = DeleteAssistantResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_DELETE_ASSISTANT /* "/assistants/{assistant_id}" */],
        produces = ["application/json"]
    )
    fun deleteAssistant(
        @Parameter(description = "The ID of the assistant to delete.", required = true) @PathVariable("assistant_id") assistantId: kotlin.String
    ): ResponseEntity<DeleteAssistantResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves an assistant.",
        operationId = "getAssistant",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = AssistantObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GET_ASSISTANT /* "/assistants/{assistant_id}" */],
        produces = ["application/json"]
    )
    fun getAssistant(
        @Parameter(description = "The ID of the assistant to retrieve.", required = true) @PathVariable("assistant_id") assistantId: kotlin.String
    ): ResponseEntity<AssistantObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of assistants.",
        operationId = "listAssistants",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListAssistantsResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_ASSISTANTS /* "/assistants" */],
        produces = ["application/json"]
    )
    fun listAssistants(
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", schema = Schema(allowableValues = ["asc", "desc"], defaultValue = "desc")) @Valid @RequestParam(value = "order", required = false, defaultValue = "desc") order: kotlin.String,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @Valid @RequestParam(value = "before", required = false) before: kotlin.String?
    ): ResponseEntity<ListAssistantsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Modifies an assistant.",
        operationId = "modifyAssistant",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = AssistantObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_MODIFY_ASSISTANT /* "/assistants/{assistant_id}" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun modifyAssistant(
        @Parameter(description = "The ID of the assistant to modify.", required = true) @PathVariable("assistant_id") assistantId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody modifyAssistantRequest: ModifyAssistantRequest
    ): ResponseEntity<AssistantObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v1"
        const val PATH_CREATE_ASSISTANT: String = "/assistants"
        const val PATH_DELETE_ASSISTANT: String = "/assistants/{assistant_id}"
        const val PATH_GET_ASSISTANT: String = "/assistants/{assistant_id}"
        const val PATH_LIST_ASSISTANTS: String = "/assistants"
        const val PATH_MODIFY_ASSISTANT: String = "/assistants/{assistant_id}"
    }
}
