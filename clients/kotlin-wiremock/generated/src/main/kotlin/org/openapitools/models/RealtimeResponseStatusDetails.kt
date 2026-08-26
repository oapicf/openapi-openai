@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeResponseStatusDetails(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("reason")
    val reason: kotlin.String? = null,

    @field:JsonProperty("error")
    val error: RealtimeResponseStatusDetailsError? = null,

)
