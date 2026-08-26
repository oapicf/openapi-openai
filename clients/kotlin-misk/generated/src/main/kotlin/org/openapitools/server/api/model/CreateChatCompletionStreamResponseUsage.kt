package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateChatCompletionStreamResponseUsage(
    /** Number of tokens in the generated completion. */
    val completionTokens: kotlin.Int,
    /** Number of tokens in the prompt. */
    val promptTokens: kotlin.Int,
    /** Total number of tokens used in the request (prompt + completion). */
    val totalTokens: kotlin.Int
)
