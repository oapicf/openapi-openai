@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateThreadRequestToolResourcesFileSearchVectorStoresInner(
    @field:JsonProperty("file_ids")
    val fileIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("chunking_strategy")
    val chunkingStrategy: CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy? = null,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any? = null,

)
