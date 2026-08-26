@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CompletionUsageCompletionTokensDetails(
    @field:JsonProperty("accepted_prediction_tokens")
    val acceptedPredictionTokens: kotlin.Int? = null,

    @field:JsonProperty("audio_tokens")
    val audioTokens: kotlin.Int? = null,

    @field:JsonProperty("reasoning_tokens")
    val reasoningTokens: kotlin.Int? = null,

    @field:JsonProperty("rejected_prediction_tokens")
    val rejectedPredictionTokens: kotlin.Int? = null,

)
