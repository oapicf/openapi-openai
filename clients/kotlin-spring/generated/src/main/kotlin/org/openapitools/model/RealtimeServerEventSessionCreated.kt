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
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `session.created`.
 * @param session 
 */
data class RealtimeServerEventSessionCreated(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `session.created`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventSessionCreated.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("session", required = true) val session: RealtimeSession
) {

    /**
    * The event type, must be `session.created`.
    * Values: sessionPeriodCreated
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        sessionPeriodCreated("session.created");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventSessionCreated'")
            }
        }
    }

}

