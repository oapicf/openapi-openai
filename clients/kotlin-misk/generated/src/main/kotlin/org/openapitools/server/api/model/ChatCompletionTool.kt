package org.openapitools.server.api.model

import org.openapitools.server.api.model.FunctionObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionTool(
    /** The type of the tool. Currently, only &#x60;function&#x60; is supported. */
    val type: kotlin.String,
    val function: FunctionObject
)
