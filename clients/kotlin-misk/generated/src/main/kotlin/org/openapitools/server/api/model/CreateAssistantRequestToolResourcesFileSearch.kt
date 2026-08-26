package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateAssistantRequestToolResourcesFileSearch(
    /** The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  */
    val vectorStoreIds: kotlin.collections.List<kotlin.String>? = null,
    /** A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.  */
    val vectorStores: kotlin.collections.List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner>? = null
)
