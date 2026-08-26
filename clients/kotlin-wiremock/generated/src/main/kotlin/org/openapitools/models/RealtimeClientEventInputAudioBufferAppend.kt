@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeClientEventInputAudioBufferAppend(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("audio")
    val audio: kotlin.String,

    @field:JsonProperty("event_id")
    val eventId: kotlin.String? = null,

)
