@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestAssistantMessageFunctionCall(
    @field:JsonProperty("arguments")
    val arguments: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

)
