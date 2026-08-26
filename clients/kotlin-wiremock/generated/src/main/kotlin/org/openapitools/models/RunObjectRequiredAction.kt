@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunObjectRequiredAction(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("submit_tool_outputs")
    val submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs,

)
