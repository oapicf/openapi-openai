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
 * Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `input_audio_buffer.speech_started`.
 * @param audioStartMs Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
 * @param itemId The ID of the user message item that will be created when speech stops. 
 */
data class RealtimeServerEventInputAudioBufferSpeechStarted(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `input_audio_buffer.speech_started`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventInputAudioBufferSpeechStarted.Type,

    @Schema(example = "null", required = true, description = "Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. ")
    @get:JsonProperty("audio_start_ms", required = true) val audioStartMs: kotlin.Int,

    @Schema(example = "null", required = true, description = "The ID of the user message item that will be created when speech stops. ")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String
) {

    /**
    * The event type, must be `input_audio_buffer.speech_started`.
    * Values: input_audio_bufferPeriodSpeech_started
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        input_audio_bufferPeriodSpeech_started("input_audio_buffer.speech_started");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventInputAudioBufferSpeechStarted'")
            }
        }
    }

}

