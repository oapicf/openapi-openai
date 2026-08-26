package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CompletionUsagePromptTokensDetails(
    /** Audio input tokens present in the prompt. */
    val audioTokens: kotlin.Int? = null,
    /** Cached tokens present in the prompt. */
    val cachedTokens: kotlin.Int? = null
)
