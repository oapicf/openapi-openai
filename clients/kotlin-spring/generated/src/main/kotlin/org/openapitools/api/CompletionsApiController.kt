package org.openapitools.api

import org.openapitools.model.CreateCompletionRequest
import org.openapitools.model.CreateCompletionResponse
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
class CompletionsApiController() {

    @Operation(
        summary = "Creates a completion for the provided prompt and parameters.",
        operationId = "createCompletion",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = CreateCompletionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/completions"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createCompletion(@Parameter(description = "", required = true) @Valid @RequestBody createCompletionRequest: CreateCompletionRequest): ResponseEntity<CreateCompletionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
