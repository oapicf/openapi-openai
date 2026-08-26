package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OtherChunkingStrategyResponseParam(
    /** Always &#x60;other&#x60;. */
    val type: kotlin.String
)
