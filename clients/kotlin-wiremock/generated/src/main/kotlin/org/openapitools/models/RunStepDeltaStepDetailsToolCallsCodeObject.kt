@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDeltaStepDetailsToolCallsCodeObject(
    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("code_interpreter")
    val codeInterpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter? = null,

)
