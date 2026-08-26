@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateVectorStoreFileBatchRequest(
    @field:JsonProperty("file_ids")
    val fileIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("chunking_strategy")
    val chunkingStrategy: ChunkingStrategyRequestParam? = null,

)
