package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateAssistantRequestToolResourcesCodeInterpreter
import org.openapitools.server.api.model.ModifyThreadRequestToolResourcesFileSearch
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ModifyThreadRequestToolResources(
    val codeInterpreter: CreateAssistantRequestToolResourcesCodeInterpreter? = null,
    val fileSearch: ModifyThreadRequestToolResourcesFileSearch? = null
)
