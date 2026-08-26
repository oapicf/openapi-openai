package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeClientEventConversationItemDelete(
    /** The event type, must be &#x60;conversation.item.delete&#x60;. */
    val type: kotlin.String,
    /** The ID of the item to delete. */
    val itemId: kotlin.String,
    /** Optional client-generated ID used to identify this event. */
    val eventId: kotlin.String? = null
)
