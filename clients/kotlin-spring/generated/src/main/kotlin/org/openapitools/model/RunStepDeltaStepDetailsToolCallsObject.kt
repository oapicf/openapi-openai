package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Details of the tool call.
 * @param type Always `tool_calls`.
 * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
 */
data class RunStepDeltaStepDetailsToolCallsObject(

    @Schema(example = "null", required = true, description = "Always `tool_calls`.")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsToolCallsObject.Type,

    @field:Valid
    @Schema(example = "null", description = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. ")
    @get:JsonProperty("tool_calls") val toolCalls: kotlin.collections.List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>? = null
) {

    /**
    * Always `tool_calls`.
    * Values: tool_calls
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("tool_calls") tool_calls("tool_calls")
    }

}

