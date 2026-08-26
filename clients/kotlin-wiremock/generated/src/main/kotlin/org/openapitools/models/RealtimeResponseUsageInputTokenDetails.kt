@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeResponseUsageInputTokenDetails(
    @field:JsonProperty("cached_tokens")
    val cachedTokens: kotlin.Int? = null,

    @field:JsonProperty("text_tokens")
    val textTokens: kotlin.Int? = null,

    @field:JsonProperty("audio_tokens")
    val audioTokens: kotlin.Int? = null,

)
