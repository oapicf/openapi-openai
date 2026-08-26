@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestMessageContentPartAudio(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("input_audio")
    val inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio,

)
