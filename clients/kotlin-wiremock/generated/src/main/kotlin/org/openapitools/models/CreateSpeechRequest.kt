@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateSpeechRequest(
    @field:JsonProperty("model")
    val model: CreateSpeechRequestModel,

    @field:JsonProperty("input")
    val input: kotlin.String,

    @field:JsonProperty("voice")
    val voice: kotlin.String,

    @field:JsonProperty("response_format")
    val responseFormat: kotlin.String? = ResponseFormat.mp3,

    @field:JsonProperty("speed")
    val speed: java.math.BigDecimal? = 1,

)
