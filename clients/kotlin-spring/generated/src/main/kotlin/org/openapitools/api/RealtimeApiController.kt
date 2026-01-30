package org.openapitools.api

import org.openapitools.model.RealtimeSessionCreateRequest
import org.openapitools.model.RealtimeSessionCreateResponse
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
import org.openapitools.api.RealtimeApiController.Companion.BASE_PATH

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
class RealtimeApiController() {

    @Operation(
        summary = "Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. ",
        operationId = "createRealtimeSession",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Session created successfully.", content = [Content(schema = Schema(implementation = RealtimeSessionCreateResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_REALTIME_SESSION /* "/realtime/sessions" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createRealtimeSession(
        @Parameter(description = "Create an ephemeral API key with the given session configuration.", required = true) @Valid @RequestBody realtimeSessionCreateRequest: RealtimeSessionCreateRequest
    ): ResponseEntity<RealtimeSessionCreateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v1"
        const val PATH_CREATE_REALTIME_SESSION: String = "/realtime/sessions"
    }
}
