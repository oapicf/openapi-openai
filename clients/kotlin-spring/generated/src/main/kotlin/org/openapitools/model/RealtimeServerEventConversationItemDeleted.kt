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
 * Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `conversation.item.deleted`.
 * @param itemId The ID of the item that was deleted.
 */
data class RealtimeServerEventConversationItemDeleted(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `conversation.item.deleted`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventConversationItemDeleted.Type,

    @Schema(example = "null", required = true, description = "The ID of the item that was deleted.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String
) {

    /**
    * The event type, must be `conversation.item.deleted`.
    * Values: conversationPeriodItemPeriodDeleted
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        conversationPeriodItemPeriodDeleted("conversation.item.deleted");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventConversationItemDeleted'")
            }
        }
    }

}

