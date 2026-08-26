@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateThreadRequestToolResources(
    @field:JsonProperty("code_interpreter")
    val codeInterpreter: CreateAssistantRequestToolResourcesCodeInterpreter? = null,

    @field:JsonProperty("file_search")
    val fileSearch: CreateThreadRequestToolResourcesFileSearch? = null,

)
