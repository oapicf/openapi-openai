package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Details of the error.
 * @param type The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
 * @param message A human-readable error message.
 * @param code Error code, if any.
 * @param &#x60;param&#x60; Parameter related to the error, if any.
 * @param eventId The event_id of the client event that caused the error, if applicable. 
 */
data class RealtimeServerEventErrorError(

    @Schema(example = "null", required = true, description = "The type of error (e.g., \"invalid_request_error\", \"server_error\"). ")
    @get:JsonProperty("type", required = true) val type: kotlin.String,

    @Schema(example = "null", required = true, description = "A human-readable error message.")
    @get:JsonProperty("message", required = true) val message: kotlin.String,

    @Schema(example = "null", description = "Error code, if any.")
    @get:JsonProperty("code") val code: kotlin.String? = null,

    @Schema(example = "null", description = "Parameter related to the error, if any.")
    @get:JsonProperty("param") val `param`: kotlin.String? = null,

    @Schema(example = "null", description = "The event_id of the client event that caused the error, if applicable. ")
    @get:JsonProperty("event_id") val eventId: kotlin.String? = null
) {

}

