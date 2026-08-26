@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeClientEventConversationItemTruncate(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("content_index")
    val contentIndex: kotlin.Int,

    @field:JsonProperty("audio_end_ms")
    val audioEndMs: kotlin.Int,

    @field:JsonProperty("event_id")
    val eventId: kotlin.String? = null,

)
