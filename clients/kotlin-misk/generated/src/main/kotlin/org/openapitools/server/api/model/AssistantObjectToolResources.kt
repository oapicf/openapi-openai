package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantObjectToolResourcesCodeInterpreter
import org.openapitools.server.api.model.AssistantObjectToolResourcesFileSearch
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantObjectToolResources(
    val codeInterpreter: AssistantObjectToolResourcesCodeInterpreter? = null,
    val fileSearch: AssistantObjectToolResourcesFileSearch? = null
)
