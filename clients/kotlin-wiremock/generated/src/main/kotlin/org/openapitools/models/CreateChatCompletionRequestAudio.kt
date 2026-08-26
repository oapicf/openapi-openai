@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateChatCompletionRequestAudio(
    @field:JsonProperty("voice")
    val voice: kotlin.String,

    @field:JsonProperty("format")
    val format: kotlin.String,

)
