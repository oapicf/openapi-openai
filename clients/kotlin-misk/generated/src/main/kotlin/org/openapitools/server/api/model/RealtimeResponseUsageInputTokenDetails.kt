package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeResponseUsageInputTokenDetails(
    /** The number of cached tokens used in the Response. */
    val cachedTokens: kotlin.Int? = null,
    /** The number of text tokens used in the Response. */
    val textTokens: kotlin.Int? = null,
    /** The number of audio tokens used in the Response. */
    val audioTokens: kotlin.Int? = null
)
