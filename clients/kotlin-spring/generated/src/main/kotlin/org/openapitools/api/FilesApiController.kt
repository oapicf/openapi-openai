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
class FilesApiController() {

    @Operation(
        summary = "Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ",
        operationId = "createFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = OpenAIFile::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/files"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun createFile(@Parameter(description = "The File object (not file name) to be uploaded. ") @Valid @RequestPart("file", required = true) file: org.springframework.core.io.Resource,@Parameter(description = "The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. ", required = true, schema = Schema(allowableValues = ["fine-tune", "assistants"])) @RequestParam(value = "purpose", required = true) purpose: kotlin.String ): ResponseEntity<OpenAIFile> {
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
        value = ["/files/{file_id}"],
        produces = ["application/json"]
    )
    fun deleteFile(@Parameter(description = "The ID of the file to use for this request.", required = true) @PathVariable("file_id") fileId: kotlin.String): ResponseEntity<DeleteFileResponse> {
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
        value = ["/files/{file_id}/content"],
        produces = ["application/json"]
    )
    fun downloadFile(@Parameter(description = "The ID of the file to use for this request.", required = true) @PathVariable("file_id") fileId: kotlin.String): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of files that belong to the user's organization.",
        operationId = "listFiles",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListFilesResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/files"],
        produces = ["application/json"]
    )
    fun listFiles(@Parameter(description = "Only return files with the given purpose.") @Valid @RequestParam(value = "purpose", required = false) purpose: kotlin.String?): ResponseEntity<ListFilesResponse> {
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
        value = ["/files/{file_id}"],
        produces = ["application/json"]
    )
    fun retrieveFile(@Parameter(description = "The ID of the file to use for this request.", required = true) @PathVariable("file_id") fileId: kotlin.String): ResponseEntity<OpenAIFile> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
