package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventResponseTextDone(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;response.text.done&#x60;. */
    val type: kotlin.String,
    /** The ID of the response. */
    val responseId: kotlin.String,
    /** The ID of the item. */
    val itemId: kotlin.String,
    /** The index of the output item in the response. */
    val outputIndex: kotlin.Int,
    /** The index of the content part in the item&#39;s content array. */
    val contentIndex: kotlin.Int,
    /** The final text content. */
    val text: kotlin.String
)
