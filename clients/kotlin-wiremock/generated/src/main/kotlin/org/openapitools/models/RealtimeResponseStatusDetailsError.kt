@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeResponseStatusDetailsError(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("code")
    val code: kotlin.String? = null,

)
