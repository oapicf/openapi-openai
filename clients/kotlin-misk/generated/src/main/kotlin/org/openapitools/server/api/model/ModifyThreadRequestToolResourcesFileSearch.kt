package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ModifyThreadRequestToolResourcesFileSearch(
    /** The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  */
    val vectorStoreIds: kotlin.collections.List<kotlin.String>? = null
)
