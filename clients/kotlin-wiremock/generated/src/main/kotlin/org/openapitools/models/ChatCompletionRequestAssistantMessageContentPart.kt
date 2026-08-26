@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestAssistantMessageContentPart(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("text")
    val text: kotlin.String,

    @field:JsonProperty("refusal")
    val refusal: kotlin.String,

)
