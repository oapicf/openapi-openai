@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestMessageContentPartImage(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("image_url")
    val imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl,

)
