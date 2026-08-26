@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssistantStreamEvent(
    @field:JsonProperty("event")
    val event: kotlin.String,

    @field:JsonProperty("data")
    val `data`: kotlin.String,

    @field:JsonProperty("enabled")
    val enabled: kotlin.Boolean? = null,

)
