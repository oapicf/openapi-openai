@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeClientEventSessionUpdate(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("session")
    val session: RealtimeSessionCreateRequest,

    @field:JsonProperty("event_id")
    val eventId: kotlin.String? = null,

)
