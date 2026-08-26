@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestUserMessageContentPart(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("text")
    val text: kotlin.String,

    @field:JsonProperty("image_url")
    val imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl,

    @field:JsonProperty("input_audio")
    val inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio,

)
