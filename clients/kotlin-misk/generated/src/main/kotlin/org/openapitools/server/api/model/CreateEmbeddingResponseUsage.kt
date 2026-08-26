package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateEmbeddingResponseUsage(
    /** The number of tokens used by the prompt. */
    val promptTokens: kotlin.Int,
    /** The total number of tokens used by the request. */
    val totalTokens: kotlin.Int
)
