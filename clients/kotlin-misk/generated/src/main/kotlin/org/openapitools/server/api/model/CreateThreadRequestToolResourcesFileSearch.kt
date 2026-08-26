package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateThreadRequestToolResourcesFileSearchVectorStoresInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateThreadRequestToolResourcesFileSearch(
    /** The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  */
    val vectorStoreIds: kotlin.collections.List<kotlin.String>? = null,
    /** A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread.  */
    val vectorStores: kotlin.collections.List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner>? = null
)
