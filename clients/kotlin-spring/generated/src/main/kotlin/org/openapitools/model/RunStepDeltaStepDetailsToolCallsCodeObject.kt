package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
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
 * Details of the Code Interpreter tool call the run step was involved in.
 * @param index The index of the tool call in the tool calls array.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param id The ID of the tool call.
 * @param codeInterpreter 
 */
data class RunStepDeltaStepDetailsToolCallsCodeObject(

    @Schema(example = "null", required = true, description = "The index of the tool call in the tool calls array.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsToolCallsCodeObject.Type,

    @Schema(example = "null", description = "The ID of the tool call.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("code_interpreter") val codeInterpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter? = null
    ) {

    /**
    * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    * Values: code_interpreter
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        code_interpreter("code_interpreter");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().first{it -> it.value == value}
            }
        }
    }

}

