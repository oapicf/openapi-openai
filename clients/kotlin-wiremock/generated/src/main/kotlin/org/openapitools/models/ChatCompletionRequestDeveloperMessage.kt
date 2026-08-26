@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestDeveloperMessage(
    @field:JsonProperty("content")
    val content: ChatCompletionRequestDeveloperMessageContent,

    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
