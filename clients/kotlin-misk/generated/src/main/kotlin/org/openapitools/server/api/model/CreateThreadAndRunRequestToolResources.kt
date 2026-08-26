package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantObjectToolResourcesFileSearch
import org.openapitools.server.api.model.CreateAssistantRequestToolResourcesCodeInterpreter
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateThreadAndRunRequestToolResources(
    val codeInterpreter: CreateAssistantRequestToolResourcesCodeInterpreter? = null,
    val fileSearch: AssistantObjectToolResourcesFileSearch? = null
)
