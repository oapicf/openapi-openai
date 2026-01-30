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
 * Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `conversation.item.truncated`.
 * @param itemId The ID of the assistant message item that was truncated.
 * @param contentIndex The index of the content part that was truncated.
 * @param audioEndMs The duration up to which the audio was truncated, in milliseconds. 
 */
data class RealtimeServerEventConversationItemTruncated(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `conversation.item.truncated`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventConversationItemTruncated.Type,

    @Schema(example = "null", required = true, description = "The ID of the assistant message item that was truncated.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "null", required = true, description = "The index of the content part that was truncated.")
    @get:JsonProperty("content_index", required = true) val contentIndex: kotlin.Int,

    @Schema(example = "null", required = true, description = "The duration up to which the audio was truncated, in milliseconds. ")
    @get:JsonProperty("audio_end_ms", required = true) val audioEndMs: kotlin.Int
) {

    /**
    * The event type, must be `conversation.item.truncated`.
    * Values: conversationPeriodItemPeriodTruncated
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        conversationPeriodItemPeriodTruncated("conversation.item.truncated");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventConversationItemTruncated'")
            }
        }
    }

}

