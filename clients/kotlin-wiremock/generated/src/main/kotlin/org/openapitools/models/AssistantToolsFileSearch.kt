@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssistantToolsFileSearch(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("file_search")
    val fileSearch: AssistantToolsFileSearchFileSearch? = null,

)
