package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventConversationItemTruncated(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;conversation.item.truncated&#x60;. */
    val type: kotlin.String,
    /** The ID of the assistant message item that was truncated. */
    val itemId: kotlin.String,
    /** The index of the content part that was truncated. */
    val contentIndex: kotlin.Int,
    /** The duration up to which the audio was truncated, in milliseconds.  */
    val audioEndMs: kotlin.Int
)
