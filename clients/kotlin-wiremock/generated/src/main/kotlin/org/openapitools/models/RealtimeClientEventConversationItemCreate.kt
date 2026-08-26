@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeClientEventConversationItemCreate(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("item")
    val item: RealtimeConversationItem,

    @field:JsonProperty("event_id")
    val eventId: kotlin.String? = null,

    @field:JsonProperty("previous_item_id")
    val previousItemId: kotlin.String? = null,

)
