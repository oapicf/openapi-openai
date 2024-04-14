package org.openapitools.api

import org.openapitools.model.DeleteModelResponse
import org.openapitools.model.ListModelsResponse
import org.openapitools.model.Model
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
class ModelsApiController() {

    @Operation(
        summary = "Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.",
        operationId = "deleteModel",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = DeleteModelResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/models/{model}"],
        produces = ["application/json"]
    )
    fun deleteModel(@Parameter(description = "The model to delete", required = true) @PathVariable("model") model: kotlin.String): ResponseEntity<DeleteModelResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Lists the currently available models, and provides basic information about each one such as the owner and availability.",
        operationId = "listModels",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = ListModelsResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/models"],
        produces = ["application/json"]
    )
    fun listModels(): ResponseEntity<ListModelsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.",
        operationId = "retrieveModel",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = Model::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/models/{model}"],
        produces = ["application/json"]
    )
    fun retrieveModel(@Parameter(description = "The ID of the model to use for this request", required = true) @PathVariable("model") model: kotlin.String): ResponseEntity<Model> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
