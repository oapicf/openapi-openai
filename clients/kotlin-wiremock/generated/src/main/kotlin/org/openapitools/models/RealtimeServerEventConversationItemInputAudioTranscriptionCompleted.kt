@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(
    @field:JsonProperty("event_id")
    val eventId: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("content_index")
    val contentIndex: kotlin.Int,

    @field:JsonProperty("transcript")
    val transcript: kotlin.String,

)
