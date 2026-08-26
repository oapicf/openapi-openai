package org.openapitools.server.api.model

import org.openapitools.server.api.model.FunctionObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantToolsFunction(
    /** The type of tool being defined: &#x60;function&#x60; */
    val type: kotlin.String,
    val function: FunctionObject
)
