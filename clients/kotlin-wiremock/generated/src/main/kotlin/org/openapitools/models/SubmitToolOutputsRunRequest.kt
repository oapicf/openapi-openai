@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SubmitToolOutputsRunRequest(
    @field:JsonProperty("tool_outputs")
    val toolOutputs: kotlin.collections.List<SubmitToolOutputsRunRequestToolOutputsInner>,

    @field:JsonProperty("stream")
    val stream: kotlin.Boolean? = null,

)
