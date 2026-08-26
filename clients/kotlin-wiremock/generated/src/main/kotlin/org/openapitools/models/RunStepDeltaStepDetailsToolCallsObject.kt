@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDeltaStepDetailsToolCallsObject(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("tool_calls")
    val toolCalls: kotlin.collections.List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>? = null,

)
