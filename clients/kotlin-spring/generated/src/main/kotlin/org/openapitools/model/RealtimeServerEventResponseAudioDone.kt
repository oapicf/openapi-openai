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
 * Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `response.audio.done`.
 * @param responseId The ID of the response.
 * @param itemId The ID of the item.
 * @param outputIndex The index of the output item in the response.
 * @param contentIndex The index of the content part in the item's content array.
 */
data class RealtimeServerEventResponseAudioDone(

    @Schema(required = true, description = "The unique ID of the server event.")
    @param:JsonProperty("event_id")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(required = true, description = "The event type, must be `response.audio.done`.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventResponseAudioDone.Type,

    @Schema(required = true, description = "The ID of the response.")
    @param:JsonProperty("response_id")
    @get:JsonProperty("response_id", required = true) val responseId: kotlin.String,

    @Schema(required = true, description = "The ID of the item.")
    @param:JsonProperty("item_id")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(required = true, description = "The index of the output item in the response.")
    @param:JsonProperty("output_index")
    @get:JsonProperty("output_index", required = true) val outputIndex: kotlin.Int,

    @Schema(required = true, description = "The index of the content part in the item's content array.")
    @param:JsonProperty("content_index")
    @get:JsonProperty("content_index", required = true) val contentIndex: kotlin.Int
) {

    /**
    * The event type, must be `response.audio.done`.
    * Values: responsePeriodAudioPeriodDone
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        responsePeriodAudioPeriodDone("response.audio.done");

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

