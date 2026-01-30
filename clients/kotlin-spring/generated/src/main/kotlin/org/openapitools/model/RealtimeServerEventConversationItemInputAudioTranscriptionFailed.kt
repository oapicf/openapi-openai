package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
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
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `conversation.item.input_audio_transcription.failed`. 
 * @param itemId The ID of the user message item.
 * @param contentIndex The index of the content part containing the audio.
 * @param error 
 */
data class RealtimeServerEventConversationItemInputAudioTranscriptionFailed(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `conversation.item.input_audio_transcription.failed`. ")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventConversationItemInputAudioTranscriptionFailed.Type,

    @Schema(example = "null", required = true, description = "The ID of the user message item.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "null", required = true, description = "The index of the content part containing the audio.")
    @get:JsonProperty("content_index", required = true) val contentIndex: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("error", required = true) val error: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
) {

    /**
    * The event type, must be `conversation.item.input_audio_transcription.failed`. 
    * Values: conversationPeriodItemPeriodInput_audio_transcriptionPeriodFailed
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        conversationPeriodItemPeriodInput_audio_transcriptionPeriodFailed("conversation.item.input_audio_transcription.failed");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventConversationItemInputAudioTranscriptionFailed'")
            }
        }
    }

}

