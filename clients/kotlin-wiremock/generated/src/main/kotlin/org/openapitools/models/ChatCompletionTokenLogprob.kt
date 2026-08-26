@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionTokenLogprob(
    @field:JsonProperty("token")
    val token: kotlin.String,

    @field:JsonProperty("logprob")
    val logprob: java.math.BigDecimal,

    @field:JsonProperty("bytes")
    val bytes: kotlin.collections.List<kotlin.Int>,

    @field:JsonProperty("top_logprobs")
    val topLogprobs: kotlin.collections.List<ChatCompletionTokenLogprobTopLogprobsInner>,

)
