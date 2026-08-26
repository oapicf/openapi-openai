package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventConversationCreatedConversation(
    /** The unique ID of the conversation. */
    val id: kotlin.String? = null,
    /** The object type, must be &#x60;realtime.conversation&#x60;. */
    val `object`: kotlin.String? = null
)
