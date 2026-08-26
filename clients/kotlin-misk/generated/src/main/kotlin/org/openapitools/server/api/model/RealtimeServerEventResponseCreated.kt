package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventResponseCreated(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;response.created&#x60;. */
    val type: kotlin.String,
    val response: RealtimeResponse
)
