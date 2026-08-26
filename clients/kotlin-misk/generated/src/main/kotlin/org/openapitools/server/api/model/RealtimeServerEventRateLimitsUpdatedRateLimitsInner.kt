package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventRateLimitsUpdatedRateLimitsInner(
    /** The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  */
    val name: kotlin.String? = null,
    /** The maximum allowed value for the rate limit. */
    val limit: kotlin.Int? = null,
    /** The remaining value before the limit is reached. */
    val remaining: kotlin.Int? = null,
    /** Seconds until the rate limit resets. */
    val resetSeconds: java.math.BigDecimal? = null
)
