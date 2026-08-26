@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter(
    @field:JsonProperty("input")
    val input: kotlin.String? = null,

    @field:JsonProperty("outputs")
    val outputs: kotlin.collections.List<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>? = null,

)
