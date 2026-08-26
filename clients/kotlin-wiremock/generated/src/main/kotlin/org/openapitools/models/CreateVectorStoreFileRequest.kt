@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateVectorStoreFileRequest(
    @field:JsonProperty("file_id")
    val fileId: kotlin.String,

    @field:JsonProperty("chunking_strategy")
    val chunkingStrategy: ChunkingStrategyRequestParam? = null,

)
