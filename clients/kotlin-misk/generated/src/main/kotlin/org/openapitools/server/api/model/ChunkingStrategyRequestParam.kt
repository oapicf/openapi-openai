package org.openapitools.server.api.model

import org.openapitools.server.api.model.AutoChunkingStrategyRequestParam
import org.openapitools.server.api.model.StaticChunkingStrategy
import org.openapitools.server.api.model.StaticChunkingStrategyRequestParam
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChunkingStrategyRequestParam(
    /** Always &#x60;auto&#x60;. */
    val type: kotlin.String,
    val static: StaticChunkingStrategy
)
