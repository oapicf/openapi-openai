package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner(
    /** A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  */
    val fileIds: kotlin.collections.List<kotlin.String>? = null,
    val chunkingStrategy: CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy? = null,
    /** Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any? = null
)
