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
 * Returned when the model-generated transcription of audio output is updated. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `response.audio_transcript.delta`.
 * @param responseId The ID of the response.
 * @param itemId The ID of the item.
 * @param outputIndex The index of the output item in the response.
 * @param contentIndex The index of the content part in the item's content array.
 * @param delta The transcript delta.
 */
data class RealtimeServerEventResponseAudioTranscriptDelta(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `response.audio_transcript.delta`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventResponseAudioTranscriptDelta.Type,

    @Schema(example = "null", required = true, description = "The ID of the response.")
    @get:JsonProperty("response_id", required = true) val responseId: kotlin.String,

    @Schema(example = "null", required = true, description = "The ID of the item.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "null", required = true, description = "The index of the output item in the response.")
    @get:JsonProperty("output_index", required = true) val outputIndex: kotlin.Int,

    @Schema(example = "null", required = true, description = "The index of the content part in the item's content array.")
    @get:JsonProperty("content_index", required = true) val contentIndex: kotlin.Int,

    @Schema(example = "null", required = true, description = "The transcript delta.")
    @get:JsonProperty("delta", required = true) val delta: kotlin.String
) {

    /**
    * The event type, must be `response.audio_transcript.delta`.
    * Values: responsePeriodAudio_transcriptPeriodDelta
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        responsePeriodAudio_transcriptPeriodDelta("response.audio_transcript.delta");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventResponseAudioTranscriptDelta'")
            }
        }
    }

}

