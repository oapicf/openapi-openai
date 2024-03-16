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
        summary = "Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. ",
        operationId = "createFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = OpenAIFile::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/files"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun createFile(@Parameter(description = "Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). ") @Valid @RequestPart("file", required = true) file: org.springframework.core.io.Resource,@Parameter(description = "The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. ", required = true) @RequestParam(value = "purpose", required = true) purpose: kotlin.String ): ResponseEntity<OpenAIFile> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete a file.",
        operationId = "deleteFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = DeleteFileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/files/{file_id}"],
        produces = ["application/json"]
    )
    fun deleteFile(@Parameter(description = "The ID of the file to use for this request", required = true) @PathVariable("file_id") fileId: kotlin.String): ResponseEntity<DeleteFileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns the contents of the specified file",
        operationId = "downloadFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/files/{file_id}/content"],
        produces = ["application/json"]
    )
    fun downloadFile(@Parameter(description = "The ID of the file to use for this request", required = true) @PathVariable("file_id") fileId: kotlin.String): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of files that belong to the user's organization.",
        operationId = "listFiles",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListFilesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/files"],
        produces = ["application/json"]
    )
    fun listFiles(): ResponseEntity<ListFilesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns information about a specific file.",
        operationId = "retrieveFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = OpenAIFile::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/files/{file_id}"],
        produces = ["application/json"]
    )
    fun retrieveFile(@Parameter(description = "The ID of the file to use for this request", required = true) @PathVariable("file_id") fileId: kotlin.String): ResponseEntity<OpenAIFile> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
