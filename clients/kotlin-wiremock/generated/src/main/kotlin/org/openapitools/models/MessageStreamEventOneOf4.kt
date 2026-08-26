@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageStreamEventOneOf4(
    @field:JsonProperty("event")
    val event: kotlin.String,

    @field:JsonProperty("data")
    val `data`: MessageObject,

)
