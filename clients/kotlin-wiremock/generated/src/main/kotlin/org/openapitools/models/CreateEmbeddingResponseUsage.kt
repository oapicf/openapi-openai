@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateEmbeddingResponseUsage(
    @field:JsonProperty("prompt_tokens")
    val promptTokens: kotlin.Int,

    @field:JsonProperty("total_tokens")
    val totalTokens: kotlin.Int,

)
