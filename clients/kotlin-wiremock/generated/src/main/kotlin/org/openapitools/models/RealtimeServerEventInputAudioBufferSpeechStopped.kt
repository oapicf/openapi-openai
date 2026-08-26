@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeServerEventInputAudioBufferSpeechStopped(
    @field:JsonProperty("event_id")
    val eventId: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("audio_end_ms")
    val audioEndMs: kotlin.Int,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

)
