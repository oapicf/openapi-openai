@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateChatCompletionFunctionResponseChoicesInner(
    @field:JsonProperty("finish_reason")
    val finishReason: kotlin.String,

    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("message")
    val message: ChatCompletionResponseMessage,

)
