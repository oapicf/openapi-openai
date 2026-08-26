@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateCompletionResponseChoicesInnerLogprobs(
    @field:JsonProperty("text_offset")
    val textOffset: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("token_logprobs")
    val tokenLogprobs: kotlin.collections.List<java.math.BigDecimal>? = null,

    @field:JsonProperty("tokens")
    val tokens: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("top_logprobs")
    val topLogprobs: kotlin.collections.List<kotlin.collections.Map<kotlin.String, java.math.BigDecimal>>? = null,

)
