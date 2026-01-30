package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeConversationItem
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
 * Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 
 * @param type The event type, must be `conversation.item.create`.
 * @param item 
 * @param eventId Optional client-generated ID used to identify this event.
 * @param previousItemId The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
 */
data class RealtimeClientEventConversationItemCreate(

    @Schema(example = "null", required = true, description = "The event type, must be `conversation.item.create`.")
    @get:JsonProperty("type", required = true) val type: RealtimeClientEventConversationItemCreate.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("item", required = true) val item: RealtimeConversationItem,

    @Schema(example = "null", description = "Optional client-generated ID used to identify this event.")
    @get:JsonProperty("event_id") val eventId: kotlin.String? = null,

    @Schema(example = "null", description = "The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. ")
    @get:JsonProperty("previous_item_id") val previousItemId: kotlin.String? = null
) {

    /**
    * The event type, must be `conversation.item.create`.
    * Values: conversationPeriodItemPeriodCreate
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        conversationPeriodItemPeriodCreate("conversation.item.create");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeClientEventConversationItemCreate'")
            }
        }
    }

}

