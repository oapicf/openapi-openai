package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
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
 * The Code Interpreter tool call definition.
 * @param input The input to the Code Interpreter tool call.
 * @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
 */
data class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter(

    @Schema(example = "null", description = "The input to the Code Interpreter tool call.")
    @get:JsonProperty("input") val input: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.")
    @get:JsonProperty("outputs") val outputs: kotlin.collections.List<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>? = null
    ) {

}

