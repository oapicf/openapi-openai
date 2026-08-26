@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateChatCompletionStreamResponseUsage(
    @field:JsonProperty("completion_tokens")
    val completionTokens: kotlin.Int,

    @field:JsonProperty("prompt_tokens")
    val promptTokens: kotlin.Int,

    @field:JsonProperty("total_tokens")
    val totalTokens: kotlin.Int,

)
