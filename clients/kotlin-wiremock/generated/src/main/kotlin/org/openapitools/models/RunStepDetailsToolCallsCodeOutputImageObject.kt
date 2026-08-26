@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDetailsToolCallsCodeOutputImageObject(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("image")
    val image: RunStepDetailsToolCallsCodeOutputImageObjectImage,

)
