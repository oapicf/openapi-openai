package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter
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
 * @param id The ID of the tool call.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param codeInterpreter 
 */
data class RunStepDetailsToolCallsCodeObject(

    @Schema(example = "null", required = true, description = "The ID of the tool call.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.")
    @get:JsonProperty("type", required = true) val type: RunStepDetailsToolCallsCodeObject.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("code_interpreter", required = true) val codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter
) {

    /**
    * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    * Values: code_interpreter
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("code_interpreter") code_interpreter("code_interpreter")
    }

}

