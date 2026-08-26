@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeServerEventRateLimitsUpdatedRateLimitsInner(
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("limit")
    val limit: kotlin.Int? = null,

    @field:JsonProperty("remaining")
    val remaining: kotlin.Int? = null,

    @field:JsonProperty("reset_seconds")
    val resetSeconds: java.math.BigDecimal? = null,

)
