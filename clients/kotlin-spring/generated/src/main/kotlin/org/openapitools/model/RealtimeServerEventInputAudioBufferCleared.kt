package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `input_audio_buffer.cleared`.
 */
data class RealtimeServerEventInputAudioBufferCleared(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `input_audio_buffer.cleared`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventInputAudioBufferCleared.Type
) {

    /**
    * The event type, must be `input_audio_buffer.cleared`.
    * Values: input_audio_bufferPeriodCleared
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        input_audio_bufferPeriodCleared("input_audio_buffer.cleared");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventInputAudioBufferCleared'")
            }
        }
    }

}

