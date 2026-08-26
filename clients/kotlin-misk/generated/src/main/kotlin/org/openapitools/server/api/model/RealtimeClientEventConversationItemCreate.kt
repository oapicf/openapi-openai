package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeConversationItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeClientEventConversationItemCreate(
    /** The event type, must be &#x60;conversation.item.create&#x60;. */
    val type: kotlin.String,
    val item: RealtimeConversationItem,
    /** Optional client-generated ID used to identify this event. */
    val eventId: kotlin.String? = null,
    /** The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  */
    val previousItemId: kotlin.String? = null
)
