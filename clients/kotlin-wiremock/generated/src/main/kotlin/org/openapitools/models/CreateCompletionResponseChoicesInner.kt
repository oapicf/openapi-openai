@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateCompletionResponseChoicesInner(
    @field:JsonProperty("finish_reason")
    val finishReason: kotlin.String,

    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("logprobs")
    val logprobs: CreateCompletionResponseChoicesInnerLogprobs,

    @field:JsonProperty("text")
    val text: kotlin.String,

)
