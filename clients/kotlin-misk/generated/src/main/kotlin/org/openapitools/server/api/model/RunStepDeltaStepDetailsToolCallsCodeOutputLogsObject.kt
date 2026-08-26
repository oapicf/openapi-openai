package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(
    /** The index of the output in the outputs array. */
    val index: kotlin.Int,
    /** Always &#x60;logs&#x60;. */
    val type: kotlin.String,
    /** The text output from the Code Interpreter tool call. */
    val logs: kotlin.String? = null
)
