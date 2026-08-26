package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeSessionCreateRequest
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeClientEventSessionUpdate(
    /** The event type, must be &#x60;session.update&#x60;. */
    val type: kotlin.String,
    val session: RealtimeSessionCreateRequest,
    /** Optional client-generated ID used to identify this event. */
    val eventId: kotlin.String? = null
)
