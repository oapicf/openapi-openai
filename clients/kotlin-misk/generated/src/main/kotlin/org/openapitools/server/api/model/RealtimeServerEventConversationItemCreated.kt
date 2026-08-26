package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeConversationItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventConversationItemCreated(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;conversation.item.created&#x60;. */
    val type: kotlin.String,
    /** The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  */
    val previousItemId: kotlin.String,
    val item: RealtimeConversationItem
)
