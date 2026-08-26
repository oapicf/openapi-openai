@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ThreadStreamEvent(
    @field:JsonProperty("event")
    val event: kotlin.String,

    @field:JsonProperty("data")
    val `data`: ThreadObject,

    @field:JsonProperty("enabled")
    val enabled: kotlin.Boolean? = null,

)
