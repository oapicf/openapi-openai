package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeSessionCreateRequest
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
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
 * @param type The event type, must be `session.update`.
 * @param session 
 * @param eventId Optional client-generated ID used to identify this event.
 */
data class RealtimeClientEventSessionUpdate(

    @Schema(example = "null", required = true, description = "The event type, must be `session.update`.")
    @get:JsonProperty("type", required = true) val type: RealtimeClientEventSessionUpdate.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("session", required = true) val session: RealtimeSessionCreateRequest,

    @Schema(example = "null", description = "Optional client-generated ID used to identify this event.")
    @get:JsonProperty("event_id") val eventId: kotlin.String? = null
) {

    /**
    * The event type, must be `session.update`.
    * Values: sessionPeriodUpdate
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        sessionPeriodUpdate("session.update");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeClientEventSessionUpdate'")
            }
        }
    }

}

