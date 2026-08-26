@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssistantObjectToolResources(
    @field:JsonProperty("code_interpreter")
    val codeInterpreter: AssistantObjectToolResourcesCodeInterpreter? = null,

    @field:JsonProperty("file_search")
    val fileSearch: AssistantObjectToolResourcesFileSearch? = null,

)
