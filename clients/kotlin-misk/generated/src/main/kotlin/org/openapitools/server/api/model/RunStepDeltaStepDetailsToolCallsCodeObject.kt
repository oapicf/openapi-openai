package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaStepDetailsToolCallsCodeObject(
    /** The index of the tool call in the tool calls array. */
    val index: kotlin.Int,
    /** The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. */
    val type: kotlin.String,
    /** The ID of the tool call. */
    val id: kotlin.String? = null,
    val codeInterpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter? = null
)
