@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDetailsToolCallsObjectToolCallsInner(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("code_interpreter")
    val codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter,

    @field:JsonProperty("file_search")
    val fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch,

    @field:JsonProperty("function")
    val function: RunStepDetailsToolCallsFunctionObjectFunction,

)
