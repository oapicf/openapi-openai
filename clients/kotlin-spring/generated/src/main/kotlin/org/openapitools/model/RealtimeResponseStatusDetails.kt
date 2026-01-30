package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeResponseStatusDetailsError
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
 * Additional details about the status.
 * @param type The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
 * @param reason The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
 * @param error 
 */
data class RealtimeResponseStatusDetails(

    @Schema(example = "null", description = "The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). ")
    @get:JsonProperty("type") val type: RealtimeResponseStatusDetails.Type? = null,

    @Schema(example = "null", description = "The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). ")
    @get:JsonProperty("reason") val reason: RealtimeResponseStatusDetails.Reason? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("error") val error: RealtimeResponseStatusDetailsError? = null
) {

    /**
    * The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
    * Values: completed,cancelled,failed,incomplete
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        completed("completed"),
        cancelled("cancelled"),
        failed("failed"),
        incomplete("incomplete");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeResponseStatusDetails'")
            }
        }
    }

    /**
    * The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
    * Values: turn_detected,client_cancelled,max_output_tokens,content_filter
    */
    enum class Reason(@get:JsonValue val value: kotlin.String) {

        turn_detected("turn_detected"),
        client_cancelled("client_cancelled"),
        max_output_tokens("max_output_tokens"),
        content_filter("content_filter");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Reason {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeResponseStatusDetails'")
            }
        }
    }

}

