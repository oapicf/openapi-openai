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
 * Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 * @param type The event type, must be `input_audio_buffer.append`.
 * @param audio Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
 * @param eventId Optional client-generated ID used to identify this event.
 */
data class RealtimeClientEventInputAudioBufferAppend(

    @Schema(example = "null", required = true, description = "The event type, must be `input_audio_buffer.append`.")
    @get:JsonProperty("type", required = true) val type: RealtimeClientEventInputAudioBufferAppend.Type,

    @Schema(example = "null", required = true, description = "Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. ")
    @get:JsonProperty("audio", required = true) val audio: kotlin.String,

    @Schema(example = "null", description = "Optional client-generated ID used to identify this event.")
    @get:JsonProperty("event_id") val eventId: kotlin.String? = null
) {

    /**
    * The event type, must be `input_audio_buffer.append`.
    * Values: input_audio_bufferPeriodAppend
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        input_audio_bufferPeriodAppend("input_audio_buffer.append");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeClientEventInputAudioBufferAppend'")
            }
        }
    }

}

