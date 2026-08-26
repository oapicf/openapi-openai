package org.openapitools.server.api.model

import org.openapitools.server.api.model.VectorStoreFileBatchObjectFileCounts
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VectorStoreFileBatchObject(
    /** The identifier, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The object type, which is always &#x60;vector_store.file_batch&#x60;. */
    val `object`: kotlin.String,
    /** The Unix timestamp (in seconds) for when the vector store files batch was created. */
    val createdAt: kotlin.Int,
    /** The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. */
    val vectorStoreId: kotlin.String,
    /** The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. */
    val status: kotlin.String,
    val fileCounts: VectorStoreFileBatchObjectFileCounts
)
