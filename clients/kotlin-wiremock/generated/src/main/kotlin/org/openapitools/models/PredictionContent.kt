@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PredictionContent(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("content")
    val content: PredictionContentContent,

)
