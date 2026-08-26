@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDeltaObjectDeltaStepDetails(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("message_creation")
    val messageCreation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? = null,

    @field:JsonProperty("tool_calls")
    val toolCalls: kotlin.collections.List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>? = null,

)
