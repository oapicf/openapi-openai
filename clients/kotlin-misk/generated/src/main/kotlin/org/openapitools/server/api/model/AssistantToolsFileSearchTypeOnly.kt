package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantToolsFileSearchTypeOnly(
    /** The type of tool being defined: &#x60;file_search&#x60; */
    val type: kotlin.String
)
