package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeSession
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
 * Returned when a session is updated with a `session.update` event, unless  there is an error. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `session.updated`.
 * @param session 
 */
data class RealtimeServerEventSessionUpdated(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `session.updated`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventSessionUpdated.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("session", required = true) val session: RealtimeSession
) {

    /**
    * The event type, must be `session.updated`.
    * Values: sessionPeriodUpdated
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        sessionPeriodUpdated("session.updated");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventSessionUpdated'")
            }
        }
    }

}

