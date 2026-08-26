package org.openapitools.server.api.model

import org.openapitools.server.api.model.ModifyAssistantRequestToolResourcesCodeInterpreter
import org.openapitools.server.api.model.ModifyAssistantRequestToolResourcesFileSearch
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ModifyAssistantRequestToolResources(
    val codeInterpreter: ModifyAssistantRequestToolResourcesCodeInterpreter? = null,
    val fileSearch: ModifyAssistantRequestToolResourcesFileSearch? = null
)
