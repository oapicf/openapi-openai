package org.openapitools.api

import org.openapitools.model.DeleteFileResponse
import org.openapitools.model.ListFilesResponse
import org.openapitools.model.OpenAIFile
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
import org.openapitools.api.FilesApiController.Companion.BASE_PATH

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
class FilesApiController() {

    @Operation(
        summary = "Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ",
        operationId = "createFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = OpenAIFile::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_FILE /* "/files" */],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun createFile(
        @Parameter(description = "The File object (not file name) to be uploaded. ") @Valid @RequestPart("file", required = true) file: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). ", required = true, schema = Schema(allowableValues = ["assistants", "batch", "fine-tune", "vision"])) @Valid @RequestParam(value = "purpose", required = true) purpose: kotlin.String
    ): ResponseEntity<OpenAIFile> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete a file.",
        operationId = "deleteFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = DeleteFileResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_DELETE_FILE /* "/files/{file_id}" */],
        produces = ["application/json"]
    )
    fun deleteFile(
        @Parameter(description = "The ID of the file to use for this request.", required = true) @PathVariable("file_id") fileId: kotlin.String
    ): ResponseEntity<DeleteFileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns the contents of the specified file.",
        operationId = "downloadFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_DOWNLOAD_FILE /* "/files/{file_id}/content" */],
        produces = ["application/json"]
    )
    fun downloadFile(
        @Parameter(description = "The ID of the file to use for this request.", required = true) @PathVariable("file_id") fileId: kotlin.String
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of files.",
        operationId = "listFiles",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListFilesResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_FILES /* "/files" */],
        produces = ["application/json"]
    )
    fun listFiles(
        @Parameter(description = "Only return files with the given purpose.") @Valid @RequestParam(value = "purpose", required = false) purpose: kotlin.String?,
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. ", schema = Schema(defaultValue = "10000")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "10000") limit: kotlin.Int,
        @Parameter(description = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", schema = Schema(allowableValues = ["asc", "desc"], defaultValue = "desc")) @Valid @RequestParam(value = "order", required = false, defaultValue = "desc") order: kotlin.String,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?
    ): ResponseEntity<ListFilesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns information about a specific file.",
        operationId = "retrieveFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = OpenAIFile::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_RETRIEVE_FILE /* "/files/{file_id}" */],
        produces = ["application/json"]
    )
    fun retrieveFile(
        @Parameter(description = "The ID of the file to use for this request.", required = true) @PathVariable("file_id") fileId: kotlin.String
    ): ResponseEntity<OpenAIFile> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v1"
        const val PATH_CREATE_FILE: String = "/files"
        const val PATH_DELETE_FILE: String = "/files/{file_id}"
        const val PATH_DOWNLOAD_FILE: String = "/files/{file_id}/content"
        const val PATH_LIST_FILES: String = "/files"
        const val PATH_RETRIEVE_FILE: String = "/files/{file_id}"
    }
}
