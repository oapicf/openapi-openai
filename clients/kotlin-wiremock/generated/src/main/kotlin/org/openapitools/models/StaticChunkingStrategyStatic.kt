@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class StaticChunkingStrategyStatic(
    @field:JsonProperty("max_chunk_size_tokens")
    val maxChunkSizeTokens: kotlin.Int,

    @field:JsonProperty("chunk_overlap_tokens")
    val chunkOverlapTokens: kotlin.Int,

)
