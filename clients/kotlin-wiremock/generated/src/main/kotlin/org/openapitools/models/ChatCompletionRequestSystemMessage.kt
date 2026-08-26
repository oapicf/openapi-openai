@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestSystemMessage(
    @field:JsonProperty("content")
    val content: ChatCompletionRequestSystemMessageContent,

    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
