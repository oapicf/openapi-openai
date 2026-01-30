package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeServerEventErrorError
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
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `error`.
 * @param error 
 */
data class RealtimeServerEventError(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `error`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventError.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("error", required = true) val error: RealtimeServerEventErrorError
) {

    /**
    * The event type, must be `error`.
    * Values: error
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        error("error");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventError'")
            }
        }
    }

}

