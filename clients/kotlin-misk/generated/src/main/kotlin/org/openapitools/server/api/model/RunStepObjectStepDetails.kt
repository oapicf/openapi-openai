package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDetailsMessageCreationObject
import org.openapitools.server.api.model.RunStepDetailsMessageCreationObjectMessageCreation
import org.openapitools.server.api.model.RunStepDetailsToolCallsObject
import org.openapitools.server.api.model.RunStepDetailsToolCallsObjectToolCallsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepObjectStepDetails(
    /** Always &#x60;message_creation&#x60;. */
    val type: kotlin.String,
    val messageCreation: RunStepDetailsMessageCreationObjectMessageCreation,
    /** An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  */
    val toolCalls: kotlin.collections.List<RunStepDetailsToolCallsObjectToolCallsInner>
)
