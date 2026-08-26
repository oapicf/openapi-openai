@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CompletionUsagePromptTokensDetails(
    @field:JsonProperty("audio_tokens")
    val audioTokens: kotlin.Int? = null,

    @field:JsonProperty("cached_tokens")
    val cachedTokens: kotlin.Int? = null,

)
