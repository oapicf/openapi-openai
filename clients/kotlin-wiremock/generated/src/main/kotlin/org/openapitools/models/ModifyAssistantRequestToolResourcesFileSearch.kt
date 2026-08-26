@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ModifyAssistantRequestToolResourcesFileSearch(
    @field:JsonProperty("vector_store_ids")
    val vectorStoreIds: kotlin.collections.List<kotlin.String>? = null,

)
