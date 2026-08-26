@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionMessageToolCall(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("function")
    val function: ChatCompletionMessageToolCallFunction,

)
