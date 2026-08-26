package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantsNamedToolChoiceFunction
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionNamedToolChoice(
    /** The type of the tool. Currently, only &#x60;function&#x60; is supported. */
    val type: kotlin.String,
    val function: AssistantsNamedToolChoiceFunction
)
