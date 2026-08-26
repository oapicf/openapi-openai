@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateThreadAndRunRequestToolsInner(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("function")
    val function: FunctionObject,

    @field:JsonProperty("file_search")
    val fileSearch: AssistantToolsFileSearchFileSearch? = null,

)
