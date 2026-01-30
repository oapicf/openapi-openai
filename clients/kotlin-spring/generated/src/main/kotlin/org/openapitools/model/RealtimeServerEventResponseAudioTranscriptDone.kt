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
 * Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `response.audio_transcript.done`.
 * @param responseId The ID of the response.
 * @param itemId The ID of the item.
 * @param outputIndex The index of the output item in the response.
 * @param contentIndex The index of the content part in the item's content array.
 * @param transcript The final transcript of the audio.
 */
data class RealtimeServerEventResponseAudioTranscriptDone(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `response.audio_transcript.done`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventResponseAudioTranscriptDone.Type,

    @Schema(example = "null", required = true, description = "The ID of the response.")
    @get:JsonProperty("response_id", required = true) val responseId: kotlin.String,

    @Schema(example = "null", required = true, description = "The ID of the item.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "null", required = true, description = "The index of the output item in the response.")
    @get:JsonProperty("output_index", required = true) val outputIndex: kotlin.Int,

    @Schema(example = "null", required = true, description = "The index of the content part in the item's content array.")
    @get:JsonProperty("content_index", required = true) val contentIndex: kotlin.Int,

    @Schema(example = "null", required = true, description = "The final transcript of the audio.")
    @get:JsonProperty("transcript", required = true) val transcript: kotlin.String
) {

    /**
    * The event type, must be `response.audio_transcript.done`.
    * Values: responsePeriodAudio_transcriptPeriodDone
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        responsePeriodAudio_transcriptPeriodDone("response.audio_transcript.done");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventResponseAudioTranscriptDone'")
            }
        }
    }

}

