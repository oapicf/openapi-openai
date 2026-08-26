package org.openapitools.server.api.model

import org.openapitools.server.api.model.StaticChunkingStrategy
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StaticChunkingStrategyRequestParam(
    /** Always &#x60;static&#x60;. */
    val type: kotlin.String,
    val static: StaticChunkingStrategy
)
