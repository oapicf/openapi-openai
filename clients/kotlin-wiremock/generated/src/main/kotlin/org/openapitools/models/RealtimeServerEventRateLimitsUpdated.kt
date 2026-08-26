@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeServerEventRateLimitsUpdated(
    @field:JsonProperty("event_id")
    val eventId: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("rate_limits")
    val rateLimits: kotlin.collections.List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner>,

)
