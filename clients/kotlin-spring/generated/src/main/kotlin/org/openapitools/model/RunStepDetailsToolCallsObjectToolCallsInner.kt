package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDetailsToolCallsCodeObject
import org.openapitools.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter
import org.openapitools.model.RunStepDetailsToolCallsFunctionObject
import org.openapitools.model.RunStepDetailsToolCallsFunctionObjectFunction
import org.openapitools.model.RunStepDetailsToolCallsRetrievalObject
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
 * @param id The ID of the tool call object.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param codeInterpreter 
 * @param retrieval For now, this is always going to be an empty object.
 * @param function 
 */
data class RunStepDetailsToolCallsObjectToolCallsInner(

    @Schema(example = "null", required = true, description = "The ID of the tool call object.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.")
    @get:JsonProperty("type", required = true) val type: RunStepDetailsToolCallsObjectToolCallsInner.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("code_interpreter", required = true) val codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter,

    @field:Valid
    @Schema(example = "null", required = true, description = "For now, this is always going to be an empty object.")
    @get:JsonProperty("retrieval", required = true) val retrieval: kotlin.Any,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("function", required = true) val function: RunStepDetailsToolCallsFunctionObjectFunction
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

