package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantToolsCode(
    /** The type of tool being defined: &#x60;code_interpreter&#x60; */
    val type: kotlin.String
)
