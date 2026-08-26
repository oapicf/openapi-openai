@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeServerEventResponseTextDone(
    @field:JsonProperty("event_id")
    val eventId: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("response_id")
    val responseId: kotlin.String,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("output_index")
    val outputIndex: kotlin.Int,

    @field:JsonProperty("content_index")
    val contentIndex: kotlin.Int,

    @field:JsonProperty("text")
    val text: kotlin.String,

)
