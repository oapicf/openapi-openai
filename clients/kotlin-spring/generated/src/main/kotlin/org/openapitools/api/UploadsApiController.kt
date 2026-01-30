package org.openapitools.api

import org.openapitools.model.CompleteUploadRequest
import org.openapitools.model.CreateUploadRequest
import org.openapitools.model.Upload
import org.openapitools.model.UploadPart
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
import org.openapitools.api.UploadsApiController.Companion.BASE_PATH

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
class UploadsApiController() {

    @Operation(
        summary = "Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). ",
        operationId = "addUploadPart",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = UploadPart::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_ADD_UPLOAD_PART /* "/uploads/{upload_id}/parts" */],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun addUploadPart(
        @Parameter(description = "The ID of the Upload. ", required = true) @PathVariable("upload_id") uploadId: kotlin.String,
        @Parameter(description = "The chunk of bytes for this Part. ") @Valid @RequestPart("data", required = true) `data`: org.springframework.web.multipart.MultipartFile
    ): ResponseEntity<UploadPart> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Cancels the Upload. No Parts may be added after an Upload is cancelled. ",
        operationId = "cancelUpload",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = Upload::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CANCEL_UPLOAD /* "/uploads/{upload_id}/cancel" */],
        produces = ["application/json"]
    )
    fun cancelUpload(
        @Parameter(description = "The ID of the Upload. ", required = true) @PathVariable("upload_id") uploadId: kotlin.String
    ): ResponseEntity<Upload> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. ",
        operationId = "completeUpload",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = Upload::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_COMPLETE_UPLOAD /* "/uploads/{upload_id}/complete" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun completeUpload(
        @Parameter(description = "The ID of the Upload. ", required = true) @PathVariable("upload_id") uploadId: kotlin.String,
        @Parameter(description = "", required = true) @Valid @RequestBody completeUploadRequest: CompleteUploadRequest
    ): ResponseEntity<Upload> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). ",
        operationId = "createUpload",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = Upload::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_UPLOAD /* "/uploads" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createUpload(
        @Parameter(description = "", required = true) @Valid @RequestBody createUploadRequest: CreateUploadRequest
    ): ResponseEntity<Upload> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v1"
        const val PATH_ADD_UPLOAD_PART: String = "/uploads/{upload_id}/parts"
        const val PATH_CANCEL_UPLOAD: String = "/uploads/{upload_id}/cancel"
        const val PATH_COMPLETE_UPLOAD: String = "/uploads/{upload_id}/complete"
        const val PATH_CREATE_UPLOAD: String = "/uploads"
    }
}
