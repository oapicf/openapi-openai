@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepStreamEventOneOf1(
    @field:JsonProperty("event")
    val event: kotlin.String,

    @field:JsonProperty("data")
    val `data`: RunStepObject,

)
