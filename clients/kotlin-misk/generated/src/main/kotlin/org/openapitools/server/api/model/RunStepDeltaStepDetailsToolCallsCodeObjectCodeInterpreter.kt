package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter(
    /** The input to the Code Interpreter tool call. */
    val input: kotlin.String? = null,
    /** The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type. */
    val outputs: kotlin.collections.List<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>? = null
)
