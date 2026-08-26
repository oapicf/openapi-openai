package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantToolsCode
import org.openapitools.server.api.model.AssistantToolsFileSearch
import org.openapitools.server.api.model.AssistantToolsFileSearchFileSearch
import org.openapitools.server.api.model.AssistantToolsFunction
import org.openapitools.server.api.model.FunctionObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantObjectToolsInner(
    /** The type of tool being defined: &#x60;code_interpreter&#x60; */
    val type: kotlin.String,
    val function: FunctionObject,
    val fileSearch: AssistantToolsFileSearchFileSearch? = null
)
