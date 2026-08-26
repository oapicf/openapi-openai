package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
 * @param type The event type, must be `input_audio_buffer.clear`.
 * @param eventId Optional client-generated ID used to identify this event.
 */
data class RealtimeClientEventInputAudioBufferClear(

    @Schema(required = true, description = "The event type, must be `input_audio_buffer.clear`.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: RealtimeClientEventInputAudioBufferClear.Type,

    @Schema(description = "Optional client-generated ID used to identify this event.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("event_id")
    @get:JsonProperty("event_id") val eventId: kotlin.String? = null
) {

    /**
    * The event type, must be `input_audio_buffer.clear`.
    * Values: input_audio_bufferPeriodClear
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        input_audio_bufferPeriodClear("input_audio_buffer.clear");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

}

