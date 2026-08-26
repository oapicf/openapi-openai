package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantToolsCode
import org.openapitools.server.api.model.AssistantToolsFileSearchTypeOnly
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateMessageRequestAttachmentsInnerToolsInner(
    /** The type of tool being defined: &#x60;code_interpreter&#x60; */
    val type: kotlin.String
)
