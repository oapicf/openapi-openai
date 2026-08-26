package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeConversationItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventResponseOutputItemDone(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;response.output_item.done&#x60;. */
    val type: kotlin.String,
    /** The ID of the Response to which the item belongs. */
    val responseId: kotlin.String,
    /** The index of the output item in the Response. */
    val outputIndex: kotlin.Int,
    val item: RealtimeConversationItem
)
