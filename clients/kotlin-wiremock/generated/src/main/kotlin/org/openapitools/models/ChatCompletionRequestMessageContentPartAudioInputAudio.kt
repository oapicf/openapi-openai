@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestMessageContentPartAudioInputAudio(
    @field:JsonProperty("data")
    val `data`: kotlin.String,

    @field:JsonProperty("format")
    val format: kotlin.String,

)
