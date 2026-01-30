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
 * Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
 * @param type The event type, must be `input_audio_buffer.commit`.
 * @param eventId Optional client-generated ID used to identify this event.
 */
data class RealtimeClientEventInputAudioBufferCommit(

    @Schema(example = "null", required = true, description = "The event type, must be `input_audio_buffer.commit`.")
    @get:JsonProperty("type", required = true) val type: RealtimeClientEventInputAudioBufferCommit.Type,

    @Schema(example = "null", description = "Optional client-generated ID used to identify this event.")
    @get:JsonProperty("event_id") val eventId: kotlin.String? = null
) {

    /**
    * The event type, must be `input_audio_buffer.commit`.
    * Values: input_audio_bufferPeriodCommit
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        input_audio_bufferPeriodCommit("input_audio_buffer.commit");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeClientEventInputAudioBufferCommit'")
            }
        }
    }

}

