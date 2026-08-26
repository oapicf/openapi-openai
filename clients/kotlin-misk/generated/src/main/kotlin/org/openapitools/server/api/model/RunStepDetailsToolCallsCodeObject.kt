package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsCodeObject(
    /** The ID of the tool call. */
    val id: kotlin.String,
    /** The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. */
    val type: kotlin.String,
    val codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter
)
