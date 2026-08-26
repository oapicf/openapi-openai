package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChunkingStrategyRequestParam
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateVectorStoreFileRequest(
    /** A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. */
    val fileId: kotlin.String,
    val chunkingStrategy: ChunkingStrategyRequestParam? = null
)
