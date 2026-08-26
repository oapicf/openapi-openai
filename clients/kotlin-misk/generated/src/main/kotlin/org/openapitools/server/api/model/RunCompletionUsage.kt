package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunCompletionUsage(
    /** Number of completion tokens used over the course of the run. */
    val completionTokens: kotlin.Int,
    /** Number of prompt tokens used over the course of the run. */
    val promptTokens: kotlin.Int,
    /** Total number of tokens used (prompt + completion). */
    val totalTokens: kotlin.Int
)
