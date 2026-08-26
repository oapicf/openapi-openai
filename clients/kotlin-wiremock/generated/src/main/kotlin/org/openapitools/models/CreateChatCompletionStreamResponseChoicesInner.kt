@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateChatCompletionStreamResponseChoicesInner(
    @field:JsonProperty("delta")
    val delta: ChatCompletionStreamResponseDelta,

    @field:JsonProperty("finish_reason")
    val finishReason: kotlin.String,

    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("logprobs")
    val logprobs: CreateChatCompletionResponseChoicesInnerLogprobs? = null,

)
