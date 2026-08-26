package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventRateLimitsUpdated(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;rate_limits.updated&#x60;. */
    val type: kotlin.String,
    /** List of rate limit information. */
    val rateLimits: kotlin.collections.List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner>
)
