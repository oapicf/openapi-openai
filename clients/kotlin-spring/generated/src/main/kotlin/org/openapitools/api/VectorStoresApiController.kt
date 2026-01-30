package org.openapitools.api

import org.openapitools.model.CreateVectorStoreFileBatchRequest
import org.openapitools.model.CreateVectorStoreFileRequest
import org.openapitools.model.CreateVectorStoreRequest
import org.openapitools.model.DeleteVectorStoreFileResponse
import org.openapitools.model.DeleteVectorStoreResponse
import org.openapitools.model.ListVectorStoreFilesResponse
import org.openapitools.model.ListVectorStoresResponse
import org.openapitools.model.UpdateVectorStoreRequest
import org.openapitools.model.VectorStoreFileBatchObject
import org.openapitools.model.VectorStoreFileObject
import org.openapitools.model.VectorStoreObject
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
import org.openapitools.api.VectorStoresApiController.Companion.BASE_PATH

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
class VectorStoresApiController() {

    @Operation(
        summary = "Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.",
        operationId = "cancelVectorStoreFileBatch",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = VectorStoreFileBatchObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CANCEL_VECTOR_STORE_FILE_BATCH /* "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel" */],
        produces = ["application/json"]
    )
    fun cancelVectorStoreFileBatch(
        @Parameter(description = "The ID of the vector store that the file batch belongs to.", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String,
        @Parameter(description = "The ID of the file batch to cancel.", required = true) @PathVariable("batch_id") batchId: kotlin.String
    ): ResponseEntity<VectorStoreFileBatchObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a vector store.",
        operationId = "createVectorStore",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = VectorStoreObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_VECTOR_STORE /* "/vector_stores" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createVectorStore(
        @Parameter(description = "", required = true) @Valid @RequestBody createVectorStoreRequest: CreateVectorStoreRequest
    ): ResponseEntity<VectorStoreObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).",
        operationId = "createVectorStoreFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = VectorStoreFileObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_VECTOR_STORE_FILE /* "/vector_stores/{vector_store_id}/files" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createVectorStoreFile(
        @Parameter(description = "The ID of the vector store for which to create a File. ", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody createVectorStoreFileRequest: CreateVectorStoreFileRequest
    ): ResponseEntity<VectorStoreFileObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a vector store file batch.",
        operationId = "createVectorStoreFileBatch",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = VectorStoreFileBatchObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_VECTOR_STORE_FILE_BATCH /* "/vector_stores/{vector_store_id}/file_batches" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createVectorStoreFileBatch(
        @Parameter(description = "The ID of the vector store for which to create a File Batch. ", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest
    ): ResponseEntity<VectorStoreFileBatchObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete a vector store.",
        operationId = "deleteVectorStore",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = DeleteVectorStoreResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_DELETE_VECTOR_STORE /* "/vector_stores/{vector_store_id}" */],
        produces = ["application/json"]
    )
    fun deleteVectorStore(
        @Parameter(description = "The ID of the vector store to delete.", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String
    ): ResponseEntity<DeleteVectorStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.",
        operationId = "deleteVectorStoreFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = DeleteVectorStoreFileResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_DELETE_VECTOR_STORE_FILE /* "/vector_stores/{vector_store_id}/files/{file_id}" */],
        produces = ["application/json"]
    )
    fun deleteVectorStoreFile(
        @Parameter(description = "The ID of the vector store that the file belongs to.", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String,
        @Parameter(description = "The ID of the file to delete.", required = true) @PathVariable("file_id") fileId: kotlin.String
    ): ResponseEntity<DeleteVectorStoreFileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a vector store.",
        operationId = "getVectorStore",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = VectorStoreObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GET_VECTOR_STORE /* "/vector_stores/{vector_store_id}" */],
        produces = ["application/json"]
    )
    fun getVectorStore(
        @Parameter(description = "The ID of the vector store to retrieve.", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String
    ): ResponseEntity<VectorStoreObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a vector store file.",
        operationId = "getVectorStoreFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = VectorStoreFileObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GET_VECTOR_STORE_FILE /* "/vector_stores/{vector_store_id}/files/{file_id}" */],
        produces = ["application/json"]
    )
    fun getVectorStoreFile(
        @Parameter(description = "The ID of the vector store that the file belongs to.", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String,
        @Parameter(description = "The ID of the file being retrieved.", required = true) @PathVariable("file_id") fileId: kotlin.String
    ): ResponseEntity<VectorStoreFileObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a vector store file batch.",
        operationId = "getVectorStoreFileBatch",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = VectorStoreFileBatchObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GET_VECTOR_STORE_FILE_BATCH /* "/vector_stores/{vector_store_id}/file_batches/{batch_id}" */],
        produces = ["application/json"]
    )
    fun getVectorStoreFileBatch(
        @Parameter(description = "The ID of the vector store that the file batch belongs to.", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String,
        @Parameter(description = "The ID of the file batch being retrieved.", required = true) @PathVariable("batch_id") batchId: kotlin.String
    ): ResponseEntity<VectorStoreFileBatchObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of vector store files in a batch.",
        operationId = "listFilesInVectorStoreBatch",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListVectorStoreFilesResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_FILES_IN_VECTOR_STORE_BATCH /* "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files" */],
        produces = ["application/json"]
    )
    fun listFilesInVectorStoreBatch(
        @Parameter(description = "The ID of the vector store that the files belong to.", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String,
        @Parameter(description = "The ID of the file batch that the files belong to.", required = true) @PathVariable("batch_id") batchId: kotlin.String,
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", schema = Schema(allowableValues = ["asc", "desc"], defaultValue = "desc")) @Valid @RequestParam(value = "order", required = false, defaultValue = "desc") order: kotlin.String,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @Valid @RequestParam(value = "before", required = false) before: kotlin.String?,
        @Parameter(description = "Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.", schema = Schema(allowableValues = ["in_progress", "completed", "failed", "cancelled"])) @Valid @RequestParam(value = "filter", required = false) filter: kotlin.String?
    ): ResponseEntity<ListVectorStoreFilesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of vector store files.",
        operationId = "listVectorStoreFiles",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListVectorStoreFilesResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_VECTOR_STORE_FILES /* "/vector_stores/{vector_store_id}/files" */],
        produces = ["application/json"]
    )
    fun listVectorStoreFiles(
        @Parameter(description = "The ID of the vector store that the files belong to.", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String,
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", schema = Schema(allowableValues = ["asc", "desc"], defaultValue = "desc")) @Valid @RequestParam(value = "order", required = false, defaultValue = "desc") order: kotlin.String,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @Valid @RequestParam(value = "before", required = false) before: kotlin.String?,
        @Parameter(description = "Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.", schema = Schema(allowableValues = ["in_progress", "completed", "failed", "cancelled"])) @Valid @RequestParam(value = "filter", required = false) filter: kotlin.String?
    ): ResponseEntity<ListVectorStoreFilesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of vector stores.",
        operationId = "listVectorStores",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListVectorStoresResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_VECTOR_STORES /* "/vector_stores" */],
        produces = ["application/json"]
    )
    fun listVectorStores(
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", schema = Schema(allowableValues = ["asc", "desc"], defaultValue = "desc")) @Valid @RequestParam(value = "order", required = false, defaultValue = "desc") order: kotlin.String,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @Valid @RequestParam(value = "before", required = false) before: kotlin.String?
    ): ResponseEntity<ListVectorStoresResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Modifies a vector store.",
        operationId = "modifyVectorStore",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = VectorStoreObject::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_MODIFY_VECTOR_STORE /* "/vector_stores/{vector_store_id}" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun modifyVectorStore(
        @Parameter(description = "The ID of the vector store to modify.", required = true) @PathVariable("vector_store_id") vectorStoreId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody updateVectorStoreRequest: UpdateVectorStoreRequest
    ): ResponseEntity<VectorStoreObject> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v1"
        const val PATH_CANCEL_VECTOR_STORE_FILE_BATCH: String = "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel"
        const val PATH_CREATE_VECTOR_STORE: String = "/vector_stores"
        const val PATH_CREATE_VECTOR_STORE_FILE: String = "/vector_stores/{vector_store_id}/files"
        const val PATH_CREATE_VECTOR_STORE_FILE_BATCH: String = "/vector_stores/{vector_store_id}/file_batches"
        const val PATH_DELETE_VECTOR_STORE: String = "/vector_stores/{vector_store_id}"
        const val PATH_DELETE_VECTOR_STORE_FILE: String = "/vector_stores/{vector_store_id}/files/{file_id}"
        const val PATH_GET_VECTOR_STORE: String = "/vector_stores/{vector_store_id}"
        const val PATH_GET_VECTOR_STORE_FILE: String = "/vector_stores/{vector_store_id}/files/{file_id}"
        const val PATH_GET_VECTOR_STORE_FILE_BATCH: String = "/vector_stores/{vector_store_id}/file_batches/{batch_id}"
        const val PATH_LIST_FILES_IN_VECTOR_STORE_BATCH: String = "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files"
        const val PATH_LIST_VECTOR_STORE_FILES: String = "/vector_stores/{vector_store_id}/files"
        const val PATH_LIST_VECTOR_STORES: String = "/vector_stores"
        const val PATH_MODIFY_VECTOR_STORE: String = "/vector_stores/{vector_store_id}"
    }
}
