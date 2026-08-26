package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateCompletionResponseChoicesInnerLogprobs(
    val textOffset: kotlin.collections.List<kotlin.Int>? = null,
    val tokenLogprobs: kotlin.collections.List<java.math.BigDecimal>? = null,
    val tokens: kotlin.collections.List<kotlin.String>? = null,
    val topLogprobs: kotlin.collections.List<kotlin.collections.Map<kotlin.String, java.math.BigDecimal>>? = null
)
