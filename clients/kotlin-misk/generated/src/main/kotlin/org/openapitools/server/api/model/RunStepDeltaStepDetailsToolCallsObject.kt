package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaStepDetailsToolCallsObject(
    /** Always &#x60;tool_calls&#x60;. */
    val type: kotlin.String,
    /** An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  */
    val toolCalls: kotlin.collections.List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>? = null
)
