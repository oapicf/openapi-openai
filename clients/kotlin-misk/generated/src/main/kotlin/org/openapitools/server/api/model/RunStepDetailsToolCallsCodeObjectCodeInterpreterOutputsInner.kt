package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDetailsToolCallsCodeOutputImageObject
import org.openapitools.server.api.model.RunStepDetailsToolCallsCodeOutputImageObjectImage
import org.openapitools.server.api.model.RunStepDetailsToolCallsCodeOutputLogsObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
    /** Always &#x60;logs&#x60;. */
    val type: kotlin.String,
    /** The text output from the Code Interpreter tool call. */
    val logs: kotlin.String,
    val image: RunStepDetailsToolCallsCodeOutputImageObjectImage
)
