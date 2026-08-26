package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AutoChunkingStrategyRequestParam(
    /** Always &#x60;auto&#x60;. */
    val type: kotlin.String
)
