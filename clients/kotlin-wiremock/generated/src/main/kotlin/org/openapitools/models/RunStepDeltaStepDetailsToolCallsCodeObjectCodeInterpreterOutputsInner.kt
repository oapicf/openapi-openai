@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("logs")
    val logs: kotlin.String? = null,

    @field:JsonProperty("image")
    val image: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage? = null,

)
