package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeSession
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventSessionUpdated(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;session.updated&#x60;. */
    val type: kotlin.String,
    val session: RealtimeSession
)
