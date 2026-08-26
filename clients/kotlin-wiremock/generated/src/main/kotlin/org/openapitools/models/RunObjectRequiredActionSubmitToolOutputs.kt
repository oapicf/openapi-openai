@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunObjectRequiredActionSubmitToolOutputs(
    @field:JsonProperty("tool_calls")
    val toolCalls: kotlin.collections.List<RunToolCallObject>,

)
