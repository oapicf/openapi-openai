package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeServerEventConversationCreatedConversation
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventConversationCreated(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;conversation.created&#x60;. */
    val type: kotlin.String,
    val conversation: RealtimeServerEventConversationCreatedConversation
)
