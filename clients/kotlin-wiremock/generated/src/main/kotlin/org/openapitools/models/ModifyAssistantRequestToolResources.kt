@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ModifyAssistantRequestToolResources(
    @field:JsonProperty("code_interpreter")
    val codeInterpreter: ModifyAssistantRequestToolResourcesCodeInterpreter? = null,

    @field:JsonProperty("file_search")
    val fileSearch: ModifyAssistantRequestToolResourcesFileSearch? = null,

)
