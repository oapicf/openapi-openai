@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("code")
    val code: kotlin.String? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("param")
    val `param`: kotlin.String? = null,

)
