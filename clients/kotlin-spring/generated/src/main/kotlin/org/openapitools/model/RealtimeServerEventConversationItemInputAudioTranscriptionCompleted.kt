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
 * This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `conversation.item.input_audio_transcription.completed`. 
 * @param itemId The ID of the user message item containing the audio.
 * @param contentIndex The index of the content part containing the audio.
 * @param transcript The transcribed text.
 */
data class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `conversation.item.input_audio_transcription.completed`. ")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.Type,

    @Schema(example = "null", required = true, description = "The ID of the user message item containing the audio.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "null", required = true, description = "The index of the content part containing the audio.")
    @get:JsonProperty("content_index", required = true) val contentIndex: kotlin.Int,

    @Schema(example = "null", required = true, description = "The transcribed text.")
    @get:JsonProperty("transcript", required = true) val transcript: kotlin.String
) {

    /**
    * The event type, must be `conversation.item.input_audio_transcription.completed`. 
    * Values: conversationPeriodItemPeriodInput_audio_transcriptionPeriodCompleted
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        conversationPeriodItemPeriodInput_audio_transcriptionPeriodCompleted("conversation.item.input_audio_transcription.completed");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventConversationItemInputAudioTranscriptionCompleted'")
            }
        }
    }

}

