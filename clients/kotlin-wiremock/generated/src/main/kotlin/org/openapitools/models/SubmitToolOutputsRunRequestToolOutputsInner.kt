@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SubmitToolOutputsRunRequestToolOutputsInner(
    @field:JsonProperty("tool_call_id")
    val toolCallId: kotlin.String? = null,

    @field:JsonProperty("output")
    val output: kotlin.String? = null,

)
