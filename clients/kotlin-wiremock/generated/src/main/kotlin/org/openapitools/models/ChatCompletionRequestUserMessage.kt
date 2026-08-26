@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestUserMessage(
    @field:JsonProperty("content")
    val content: ChatCompletionRequestUserMessageContent,

    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
