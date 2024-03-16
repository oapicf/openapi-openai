package org.openapitools.api

import org.openapitools.model.CreateImageRequest
import org.openapitools.model.ImagesResponse
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
class ImagesApiController() {

    @Operation(
        summary = "Creates an image given a prompt.",
        operationId = "createImage",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ImagesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/images/generations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createImage(@Parameter(description = "", required = true) @Valid @RequestBody createImageRequest: CreateImageRequest): ResponseEntity<ImagesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Creates an edited or extended image given an original image and a prompt.",
        operationId = "createImageEdit",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ImagesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/images/edits"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun createImageEdit(@Parameter(description = "The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.") @Valid @RequestPart("image", required = true) image: org.springframework.core.io.Resource,@Parameter(description = "A text description of the desired image(s). The maximum length is 1000 characters.", required = true) @RequestParam(value = "prompt", required = true) prompt: kotlin.String ,@Parameter(description = "An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.") @Valid @RequestPart("mask", required = false) mask: org.springframework.core.io.Resource?,@Parameter(description = "The number of images to generate. Must be between 1 and 10.", schema = Schema(defaultValue = "1")) @RequestParam(value = "n", required = false) n: kotlin.Int ,@Parameter(description = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", schema = Schema(allowableValues = ["256x256", "512x512", "1024x1024"], defaultValue = "1024x1024")) @RequestParam(value = "size", required = false) size: kotlin.String ,@Parameter(description = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.", schema = Schema(allowableValues = ["url", "b64_json"], defaultValue = "url")) @RequestParam(value = "response_format", required = false) responseFormat: kotlin.String ,@Parameter(description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ") @RequestParam(value = "user", required = false) user: kotlin.String? ): ResponseEntity<ImagesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Creates a variation of a given image.",
        operationId = "createImageVariation",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ImagesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/images/variations"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun createImageVariation(@Parameter(description = "The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.") @Valid @RequestPart("image", required = true) image: org.springframework.core.io.Resource,@Parameter(description = "The number of images to generate. Must be between 1 and 10.", schema = Schema(defaultValue = "1")) @RequestParam(value = "n", required = false) n: kotlin.Int ,@Parameter(description = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", schema = Schema(allowableValues = ["256x256", "512x512", "1024x1024"], defaultValue = "1024x1024")) @RequestParam(value = "size", required = false) size: kotlin.String ,@Parameter(description = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.", schema = Schema(allowableValues = ["url", "b64_json"], defaultValue = "url")) @RequestParam(value = "response_format", required = false) responseFormat: kotlin.String ,@Parameter(description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ") @RequestParam(value = "user", required = false) user: kotlin.String? ): ResponseEntity<ImagesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
