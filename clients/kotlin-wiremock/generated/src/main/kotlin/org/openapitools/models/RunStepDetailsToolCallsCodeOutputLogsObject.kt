@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDetailsToolCallsCodeOutputLogsObject(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("logs")
    val logs: kotlin.String,

)
