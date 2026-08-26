package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateVectorStoreRequestChunkingStrategy
import org.openapitools.server.api.model.VectorStoreExpirationAfter
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateVectorStoreRequest(
    /** A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. */
    val fileIds: kotlin.collections.List<kotlin.String>? = null,
    /** The name of the vector store. */
    val name: kotlin.String? = null,
    val expiresAfter: VectorStoreExpirationAfter? = null,
    val chunkingStrategy: CreateVectorStoreRequestChunkingStrategy? = null,
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any? = null
)
