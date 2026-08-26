package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeResponseCreateParams
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeClientEventResponseCreate(
    /** The event type, must be &#x60;response.create&#x60;. */
    val type: kotlin.String,
    /** Optional client-generated ID used to identify this event. */
    val eventId: kotlin.String? = null,
    val response: RealtimeResponseCreateParams? = null
)
