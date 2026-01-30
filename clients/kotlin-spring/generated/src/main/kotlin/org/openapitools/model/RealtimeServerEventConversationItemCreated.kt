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
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `conversation.item.created`.
 * @param previousItemId The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
 * @param item 
 */
data class RealtimeServerEventConversationItemCreated(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `conversation.item.created`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventConversationItemCreated.Type,

    @Schema(example = "null", required = true, description = "The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. ")
    @get:JsonProperty("previous_item_id", required = true) val previousItemId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("item", required = true) val item: RealtimeConversationItem
) {

    /**
    * The event type, must be `conversation.item.created`.
    * Values: conversationPeriodItemPeriodCreated
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        conversationPeriodItemPeriodCreated("conversation.item.created");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventConversationItemCreated'")
            }
        }
    }

}

