package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventConversationItemDeleted(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;conversation.item.deleted&#x60;. */
    val type: kotlin.String,
    /** The ID of the item that was deleted. */
    val itemId: kotlin.String
)
