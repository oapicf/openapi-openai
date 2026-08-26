package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeClientEventResponseCancel(
    /** The event type, must be &#x60;response.cancel&#x60;. */
    val type: kotlin.String,
    /** Optional client-generated ID used to identify this event. */
    val eventId: kotlin.String? = null,
    /** A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  */
    val responseId: kotlin.String? = null
)
