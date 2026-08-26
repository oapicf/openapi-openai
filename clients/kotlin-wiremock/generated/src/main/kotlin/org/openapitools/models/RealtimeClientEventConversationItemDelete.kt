@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeClientEventConversationItemDelete(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("event_id")
    val eventId: kotlin.String? = null,

)
