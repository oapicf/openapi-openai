@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeResponseUsage(
    @field:JsonProperty("total_tokens")
    val totalTokens: kotlin.Int? = null,

    @field:JsonProperty("input_tokens")
    val inputTokens: kotlin.Int? = null,

    @field:JsonProperty("output_tokens")
    val outputTokens: kotlin.Int? = null,

    @field:JsonProperty("input_token_details")
    val inputTokenDetails: RealtimeResponseUsageInputTokenDetails? = null,

    @field:JsonProperty("output_token_details")
    val outputTokenDetails: RealtimeResponseUsageOutputTokenDetails? = null,

)
