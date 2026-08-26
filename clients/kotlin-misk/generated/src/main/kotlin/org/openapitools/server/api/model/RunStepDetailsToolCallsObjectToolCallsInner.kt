package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDetailsToolCallsCodeObject
import org.openapitools.server.api.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter
import org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchObject
import org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchObjectFileSearch
import org.openapitools.server.api.model.RunStepDetailsToolCallsFunctionObject
import org.openapitools.server.api.model.RunStepDetailsToolCallsFunctionObjectFunction
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsObjectToolCallsInner(
    /** The ID of the tool call object. */
    val id: kotlin.String,
    /** The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. */
    val type: kotlin.String,
    val codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter,
    val fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch,
    val function: RunStepDetailsToolCallsFunctionObjectFunction
)
