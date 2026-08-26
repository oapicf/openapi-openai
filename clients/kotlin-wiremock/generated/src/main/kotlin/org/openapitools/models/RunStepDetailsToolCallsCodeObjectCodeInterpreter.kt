@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDetailsToolCallsCodeObjectCodeInterpreter(
    @field:JsonProperty("input")
    val input: kotlin.String,

    @field:JsonProperty("outputs")
    val outputs: kotlin.collections.List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>,

)
