@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CompletionUsage(
    @field:JsonProperty("completion_tokens")
    val completionTokens: kotlin.Int,

    @field:JsonProperty("prompt_tokens")
    val promptTokens: kotlin.Int,

    @field:JsonProperty("total_tokens")
    val totalTokens: kotlin.Int,

    @field:JsonProperty("completion_tokens_details")
    val completionTokensDetails: CompletionUsageCompletionTokensDetails? = null,

    @field:JsonProperty("prompt_tokens_details")
    val promptTokensDetails: CompletionUsagePromptTokensDetails? = null,

)
