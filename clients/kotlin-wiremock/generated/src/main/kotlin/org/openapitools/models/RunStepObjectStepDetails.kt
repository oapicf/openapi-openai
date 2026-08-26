@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepObjectStepDetails(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("message_creation")
    val messageCreation: RunStepDetailsMessageCreationObjectMessageCreation,

    @field:JsonProperty("tool_calls")
    val toolCalls: kotlin.collections.List<RunStepDetailsToolCallsObjectToolCallsInner>,

)
