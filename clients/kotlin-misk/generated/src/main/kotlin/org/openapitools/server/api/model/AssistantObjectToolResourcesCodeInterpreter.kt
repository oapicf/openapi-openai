package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantObjectToolResourcesCodeInterpreter(
    /** A list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60;&#x60; tool. There can be a maximum of 20 files associated with the tool.  */
    val fileIds: kotlin.collections.List<kotlin.String>? = arrayListOf()
)
