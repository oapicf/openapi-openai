@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestMessageContentPartRefusal(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("refusal")
    val refusal: kotlin.String,

)
