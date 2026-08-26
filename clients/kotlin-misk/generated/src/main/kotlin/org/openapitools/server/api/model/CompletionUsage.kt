package org.openapitools.server.api.model

import org.openapitools.server.api.model.CompletionUsageCompletionTokensDetails
import org.openapitools.server.api.model.CompletionUsagePromptTokensDetails
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CompletionUsage(
    /** Number of tokens in the generated completion. */
    val completionTokens: kotlin.Int,
    /** Number of tokens in the prompt. */
    val promptTokens: kotlin.Int,
    /** Total number of tokens used in the request (prompt + completion). */
    val totalTokens: kotlin.Int,
    val completionTokensDetails: CompletionUsageCompletionTokensDetails? = null,
    val promptTokensDetails: CompletionUsagePromptTokensDetails? = null
)
