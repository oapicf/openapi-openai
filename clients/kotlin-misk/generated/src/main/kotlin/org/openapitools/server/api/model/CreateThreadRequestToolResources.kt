package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateAssistantRequestToolResourcesCodeInterpreter
import org.openapitools.server.api.model.CreateThreadRequestToolResourcesFileSearch
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateThreadRequestToolResources(
    val codeInterpreter: CreateAssistantRequestToolResourcesCodeInterpreter? = null,
    val fileSearch: CreateThreadRequestToolResourcesFileSearch? = null
)
