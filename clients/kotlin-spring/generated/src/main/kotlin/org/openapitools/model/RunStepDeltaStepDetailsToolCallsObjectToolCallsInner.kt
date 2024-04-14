package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObject
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObject
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsRetrievalObject
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
 * 
 * @param index The index of the tool call in the tool calls array.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param id The ID of the tool call object.
 * @param codeInterpreter 
 * @param retrieval For now, this is always going to be an empty object.
 * @param function 
 */
data class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner(

    @Schema(example = "null", required = true, description = "The index of the tool call in the tool calls array.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.Type,

    @Schema(example = "null", description = "The ID of the tool call object.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("code_interpreter") val codeInterpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter? = null,

    @field:Valid
    @Schema(example = "null", description = "For now, this is always going to be an empty object.")
    @get:JsonProperty("retrieval") val retrieval: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("function") val function: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction? = null
) {

    /**
    * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    * Values: code_interpreter,retrieval,function
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("code_interpreter") code_interpreter("code_interpreter"),
        @JsonProperty("retrieval") retrieval("retrieval"),
        @JsonProperty("function") function("function")
    }

}

