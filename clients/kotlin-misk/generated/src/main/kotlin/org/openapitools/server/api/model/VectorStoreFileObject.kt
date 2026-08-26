package org.openapitools.server.api.model

import org.openapitools.server.api.model.VectorStoreFileObjectChunkingStrategy
import org.openapitools.server.api.model.VectorStoreFileObjectLastError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VectorStoreFileObject(
    /** The identifier, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The object type, which is always &#x60;vector_store.file&#x60;. */
    val `object`: kotlin.String,
    /** The total vector store usage in bytes. Note that this may be different from the original file size. */
    val usageBytes: kotlin.Int,
    /** The Unix timestamp (in seconds) for when the vector store file was created. */
    val createdAt: kotlin.Int,
    /** The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. */
    val vectorStoreId: kotlin.String,
    /** The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. */
    val status: kotlin.String,
    val lastError: VectorStoreFileObjectLastError,
    val chunkingStrategy: VectorStoreFileObjectChunkingStrategy? = null
)
