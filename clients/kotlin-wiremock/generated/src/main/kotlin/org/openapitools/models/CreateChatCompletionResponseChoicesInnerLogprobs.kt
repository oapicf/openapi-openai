@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateChatCompletionResponseChoicesInnerLogprobs(
    @field:JsonProperty("content")
    val content: kotlin.collections.List<ChatCompletionTokenLogprob>,

    @field:JsonProperty("refusal")
    val refusal: kotlin.collections.List<ChatCompletionTokenLogprob>,

)
