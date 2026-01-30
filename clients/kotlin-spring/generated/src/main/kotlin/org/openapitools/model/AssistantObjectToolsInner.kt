package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssistantToolsCode
import org.openapitools.model.AssistantToolsFileSearch
import org.openapitools.model.AssistantToolsFileSearchFileSearch
import org.openapitools.model.AssistantToolsFunction
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
 * @param type The type of tool being defined: `code_interpreter`
 * @param function 
 * @param fileSearch 
 */
data class AssistantObjectToolsInner(

    @Schema(example = "null", required = true, description = "The type of tool being defined: `code_interpreter`")
    @get:JsonProperty("type", required = true) val type: AssistantObjectToolsInner.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("function", required = true) val function: FunctionObject,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("file_search") val fileSearch: AssistantToolsFileSearchFileSearch? = null
) {

    /**
    * The type of tool being defined: `code_interpreter`
    * Values: code_interpreter,file_search,function
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        code_interpreter("code_interpreter"),
        file_search("file_search"),
        function("function");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssistantObjectToolsInner'")
            }
        }
    }

}

