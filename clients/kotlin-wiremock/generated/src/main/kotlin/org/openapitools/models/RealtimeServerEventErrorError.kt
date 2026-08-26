@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeServerEventErrorError(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("message")
    val message: kotlin.String,

    @field:JsonProperty("code")
    val code: kotlin.String? = null,

    @field:JsonProperty("param")
    val `param`: kotlin.String? = null,

    @field:JsonProperty("event_id")
    val eventId: kotlin.String? = null,

)
