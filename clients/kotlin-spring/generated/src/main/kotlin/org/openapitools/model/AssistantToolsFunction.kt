package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.FunctionObject
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
 * @param type The type of tool being defined: `function`
 * @param function 
 */
data class AssistantToolsFunction(

    @Schema(example = "null", required = true, description = "The type of tool being defined: `function`")
    @get:JsonProperty("type", required = true) val type: AssistantToolsFunction.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("function", required = true) val function: FunctionObject
) {

    /**
    * The type of tool being defined: `function`
    * Values: function
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("function") function("function")
    }

}

