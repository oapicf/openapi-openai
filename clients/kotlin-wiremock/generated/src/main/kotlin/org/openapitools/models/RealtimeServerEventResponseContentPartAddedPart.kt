@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeServerEventResponseContentPartAddedPart(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("text")
    val text: kotlin.String? = null,

    @field:JsonProperty("audio")
    val audio: kotlin.String? = null,

    @field:JsonProperty("transcript")
    val transcript: kotlin.String? = null,

)
