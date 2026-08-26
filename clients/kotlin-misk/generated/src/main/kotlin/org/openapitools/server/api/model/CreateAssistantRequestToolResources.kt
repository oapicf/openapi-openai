package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateAssistantRequestToolResourcesCodeInterpreter
import org.openapitools.server.api.model.CreateAssistantRequestToolResourcesFileSearch
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateAssistantRequestToolResources(
    val codeInterpreter: CreateAssistantRequestToolResourcesCodeInterpreter? = null,
    val fileSearch: CreateAssistantRequestToolResourcesFileSearch? = null
)
