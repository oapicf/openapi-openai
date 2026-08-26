@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionResponseMessageAudio(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("expires_at")
    val expiresAt: kotlin.Int,

    @field:JsonProperty("data")
    val `data`: kotlin.String,

    @field:JsonProperty("transcript")
    val transcript: kotlin.String,

)
