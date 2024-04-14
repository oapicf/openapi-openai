package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunToolCallObjectFunction
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
 * Tool call objects
 * @param id The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
 * @param type The type of tool call the output is required for. For now, this is always `function`.
 * @param function 
 */
data class RunToolCallObject(

    @Schema(example = "null", required = true, description = "The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The type of tool call the output is required for. For now, this is always `function`.")
    @get:JsonProperty("type", required = true) val type: RunToolCallObject.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("function", required = true) val function: RunToolCallObjectFunction
) {

    /**
    * The type of tool call the output is required for. For now, this is always `function`.
    * Values: function
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("function") function("function")
    }

}

