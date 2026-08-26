package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeResponseUsageInputTokenDetails
import org.openapitools.server.api.model.RealtimeResponseUsageOutputTokenDetails
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeResponseUsage(
    /** The total number of tokens in the Response including input and output  text and audio tokens.  */
    val totalTokens: kotlin.Int? = null,
    /** The number of input tokens used in the Response, including text and  audio tokens.  */
    val inputTokens: kotlin.Int? = null,
    /** The number of output tokens sent in the Response, including text and  audio tokens.  */
    val outputTokens: kotlin.Int? = null,
    val inputTokenDetails: RealtimeResponseUsageInputTokenDetails? = null,
    val outputTokenDetails: RealtimeResponseUsageOutputTokenDetails? = null
)
