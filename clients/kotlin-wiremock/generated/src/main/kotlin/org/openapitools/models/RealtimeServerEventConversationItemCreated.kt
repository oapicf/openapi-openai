@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeServerEventConversationItemCreated(
    @field:JsonProperty("event_id")
    val eventId: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("previous_item_id")
    val previousItemId: kotlin.String,

    @field:JsonProperty("item")
    val item: RealtimeConversationItem,

)
