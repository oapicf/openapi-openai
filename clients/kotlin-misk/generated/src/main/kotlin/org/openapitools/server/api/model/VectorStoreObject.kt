package org.openapitools.server.api.model

import org.openapitools.server.api.model.VectorStoreExpirationAfter
import org.openapitools.server.api.model.VectorStoreObjectFileCounts
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VectorStoreObject(
    /** The identifier, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The object type, which is always &#x60;vector_store&#x60;. */
    val `object`: kotlin.String,
    /** The Unix timestamp (in seconds) for when the vector store was created. */
    val createdAt: kotlin.Int,
    /** The name of the vector store. */
    val name: kotlin.String,
    /** The total number of bytes used by the files in the vector store. */
    val usageBytes: kotlin.Int,
    val fileCounts: VectorStoreObjectFileCounts,
    /** The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. */
    val status: kotlin.String,
    /** The Unix timestamp (in seconds) for when the vector store was last active. */
    val lastActiveAt: kotlin.Int,
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any,
    val expiresAfter: VectorStoreExpirationAfter? = null,
    /** The Unix timestamp (in seconds) for when the vector store will expire. */
    val expiresAt: kotlin.Int? = null
)
