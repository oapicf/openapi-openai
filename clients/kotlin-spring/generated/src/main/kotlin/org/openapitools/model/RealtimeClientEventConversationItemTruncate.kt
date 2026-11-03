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
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  
 * @param type The event type, must be `conversation.item.truncate`.
 * @param itemId The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
 * @param contentIndex The index of the content part to truncate. Set this to 0.
 * @param audioEndMs Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
 * @param eventId Optional client-generated ID used to identify this event.
 */
data class RealtimeClientEventConversationItemTruncate(

    @Schema(required = true, description = "The event type, must be `conversation.item.truncate`.")
    @param:JsonProperty("type", required = true)
    @get:JsonProperty("type", required = true) val type: RealtimeClientEventConversationItemTruncate.Type,

    @Schema(required = true, description = "The ID of the assistant message item to truncate. Only assistant message  items can be truncated. ")
    @param:JsonProperty("item_id", required = true)
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(required = true, description = "The index of the content part to truncate. Set this to 0.")
    @param:JsonProperty("content_index", required = true)
    @get:JsonProperty("content_index", required = true) val contentIndex: kotlin.Int,

    @Schema(required = true, description = "Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. ")
    @param:JsonProperty("audio_end_ms", required = true)
    @get:JsonProperty("audio_end_ms", required = true) val audioEndMs: kotlin.Int,

    @Schema(description = "Optional client-generated ID used to identify this event.")
    @param:JsonProperty("event_id")
    @get:JsonProperty("event_id") val eventId: kotlin.String? = null
) {

    /**
    * The event type, must be `conversation.item.truncate`.
    * Values: conversationPeriodItemPeriodTruncate
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        conversationPeriodItemPeriodTruncate("conversation.item.truncate");
    
        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

}

