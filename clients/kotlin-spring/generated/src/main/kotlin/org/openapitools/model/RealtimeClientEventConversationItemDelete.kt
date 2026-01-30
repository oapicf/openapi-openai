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
 * Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 * @param type The event type, must be `conversation.item.delete`.
 * @param itemId The ID of the item to delete.
 * @param eventId Optional client-generated ID used to identify this event.
 */
data class RealtimeClientEventConversationItemDelete(

    @Schema(example = "null", required = true, description = "The event type, must be `conversation.item.delete`.")
    @get:JsonProperty("type", required = true) val type: RealtimeClientEventConversationItemDelete.Type,

    @Schema(example = "null", required = true, description = "The ID of the item to delete.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "null", description = "Optional client-generated ID used to identify this event.")
    @get:JsonProperty("event_id") val eventId: kotlin.String? = null
) {

    /**
    * The event type, must be `conversation.item.delete`.
    * Values: conversationPeriodItemPeriodDelete
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        conversationPeriodItemPeriodDelete("conversation.item.delete");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeClientEventConversationItemDelete'")
            }
        }
    }

}

