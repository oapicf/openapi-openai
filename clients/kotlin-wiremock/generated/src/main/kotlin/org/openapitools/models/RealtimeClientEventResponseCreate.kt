@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeClientEventResponseCreate(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("event_id")
    val eventId: kotlin.String? = null,

    @field:JsonProperty("response")
    val response: RealtimeResponseCreateParams? = null,

)
