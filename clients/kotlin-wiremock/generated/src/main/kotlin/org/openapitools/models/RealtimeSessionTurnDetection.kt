@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeSessionTurnDetection(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("threshold")
    val threshold: java.math.BigDecimal? = null,

    @field:JsonProperty("prefix_padding_ms")
    val prefixPaddingMs: kotlin.Int? = null,

    @field:JsonProperty("silence_duration_ms")
    val silenceDurationMs: kotlin.Int? = null,

)
