package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeClientEventConversationItemTruncate(
    /** The event type, must be &#x60;conversation.item.truncate&#x60;. */
    val type: kotlin.String,
    /** The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  */
    val itemId: kotlin.String,
    /** The index of the content part to truncate. Set this to 0. */
    val contentIndex: kotlin.Int,
    /** Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  */
    val audioEndMs: kotlin.Int,
    /** Optional client-generated ID used to identify this event. */
    val eventId: kotlin.String? = null
)
