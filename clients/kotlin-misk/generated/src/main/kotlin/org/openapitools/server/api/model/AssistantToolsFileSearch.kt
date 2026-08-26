package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantToolsFileSearchFileSearch
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantToolsFileSearch(
    /** The type of tool being defined: &#x60;file_search&#x60; */
    val type: kotlin.String,
    val fileSearch: AssistantToolsFileSearchFileSearch? = null
)
