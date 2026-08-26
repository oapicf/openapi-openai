@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssistantObjectToolResourcesFileSearch(
    @field:JsonProperty("vector_store_ids")
    val vectorStoreIds: kotlin.collections.List<kotlin.String>? = null,

)
