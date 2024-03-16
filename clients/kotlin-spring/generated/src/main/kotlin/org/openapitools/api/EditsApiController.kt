package org.openapitools.api

import org.openapitools.model.CreateEditRequest
import org.openapitools.model.CreateEditResponse
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
class EditsApiController() {

    @Operation(
        summary = "Creates a new edit for the provided input, instruction, and parameters.",
        operationId = "createEdit",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = CreateEditResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/edits"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createEdit(@Parameter(description = "", required = true) @Valid @RequestBody createEditRequest: CreateEditRequest): ResponseEntity<CreateEditResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}