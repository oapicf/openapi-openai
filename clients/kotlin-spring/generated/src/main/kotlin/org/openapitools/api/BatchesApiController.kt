package org.openapitools.api

import org.openapitools.model.Batch
import org.openapitools.model.CreateBatchRequest
import org.openapitools.model.ListBatchesResponse
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
import org.openapitools.api.BatchesApiController.Companion.BASE_PATH

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
class BatchesApiController() {

    @Operation(
        summary = "Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.",
        operationId = "cancelBatch",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Batch is cancelling. Returns the cancelling batch's details.", content = [Content(schema = Schema(implementation = Batch::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CANCEL_BATCH /* "/batches/{batch_id}/cancel" */],
        produces = ["application/json"]
    )
    fun cancelBatch(
        @Parameter(description = "The ID of the batch to cancel.", required = true) @PathVariable("batch_id") batchId: kotlin.String
    ): ResponseEntity<Batch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Creates and executes a batch from an uploaded file of requests",
        operationId = "createBatch",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Batch created successfully.", content = [Content(schema = Schema(implementation = Batch::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_BATCH /* "/batches" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createBatch(
        @Parameter(description = "", required = true) @Valid @RequestBody createBatchRequest: CreateBatchRequest
    ): ResponseEntity<Batch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List your organization's batches.",
        operationId = "listBatches",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Batch listed successfully.", content = [Content(schema = Schema(implementation = ListBatchesResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_BATCHES /* "/batches" */],
        produces = ["application/json"]
    )
    fun listBatches(
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<ListBatchesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a batch.",
        operationId = "retrieveBatch",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Batch retrieved successfully.", content = [Content(schema = Schema(implementation = Batch::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_RETRIEVE_BATCH /* "/batches/{batch_id}" */],
        produces = ["application/json"]
    )
    fun retrieveBatch(
        @Parameter(description = "The ID of the batch to retrieve.", required = true) @PathVariable("batch_id") batchId: kotlin.String
    ): ResponseEntity<Batch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v1"
        const val PATH_CANCEL_BATCH: String = "/batches/{batch_id}/cancel"
        const val PATH_CREATE_BATCH: String = "/batches"
        const val PATH_LIST_BATCHES: String = "/batches"
        const val PATH_RETRIEVE_BATCH: String = "/batches/{batch_id}"
    }
}
