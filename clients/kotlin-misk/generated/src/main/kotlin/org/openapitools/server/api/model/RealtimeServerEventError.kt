package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeServerEventErrorError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventError(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;error&#x60;. */
    val type: kotlin.String,
    val error: RealtimeServerEventErrorError
)
