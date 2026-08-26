@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ModifyAssistantRequestToolResourcesCodeInterpreter(
    @field:JsonProperty("file_ids")
    val fileIds: kotlin.collections.List<kotlin.String>? = arrayListOf(),

)
