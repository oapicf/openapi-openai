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
 * Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `input_audio_buffer.speech_stopped`.
 * @param audioEndMs Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
 * @param itemId The ID of the user message item that will be created.
 */
data class RealtimeServerEventInputAudioBufferSpeechStopped(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `input_audio_buffer.speech_stopped`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventInputAudioBufferSpeechStopped.Type,

    @Schema(example = "null", required = true, description = "Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. ")
    @get:JsonProperty("audio_end_ms", required = true) val audioEndMs: kotlin.Int,

    @Schema(example = "null", required = true, description = "The ID of the user message item that will be created.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String
) {

    /**
    * The event type, must be `input_audio_buffer.speech_stopped`.
    * Values: input_audio_bufferPeriodSpeech_stopped
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        input_audio_bufferPeriodSpeech_stopped("input_audio_buffer.speech_stopped");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventInputAudioBufferSpeechStopped'")
            }
        }
    }

}

