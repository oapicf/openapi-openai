package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ModifyAssistantRequestToolResourcesFileSearch(
    /** Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  */
    val vectorStoreIds: kotlin.collections.List<kotlin.String>? = null
)
