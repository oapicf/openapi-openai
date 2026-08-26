@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeServerEventInputAudioBufferSpeechStarted(
    @field:JsonProperty("event_id")
    val eventId: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("audio_start_ms")
    val audioStartMs: kotlin.Int,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

)
