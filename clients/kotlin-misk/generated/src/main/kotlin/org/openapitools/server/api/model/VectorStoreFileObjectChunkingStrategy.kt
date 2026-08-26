package org.openapitools.server.api.model

import org.openapitools.server.api.model.OtherChunkingStrategyResponseParam
import org.openapitools.server.api.model.StaticChunkingStrategy
import org.openapitools.server.api.model.StaticChunkingStrategyRequestParam
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VectorStoreFileObjectChunkingStrategy(
    /** Always &#x60;static&#x60;. */
    val type: kotlin.String,
    val static: StaticChunkingStrategy
)
