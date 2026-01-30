package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssistantsNamedToolChoice
import org.openapitools.model.AssistantsNamedToolChoiceFunction
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
 * Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools before responding to the user. Specifying a particular tool like `{\"type\": \"file_search\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
 * @param type The type of the tool. If type is `function`, the function name must be set
 * @param function 
 */
data class AssistantsApiToolChoiceOption(

    @Schema(example = "null", required = true, description = "The type of the tool. If type is `function`, the function name must be set")
    @get:JsonProperty("type", required = true) val type: AssistantsApiToolChoiceOption.Type,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("function") val function: AssistantsNamedToolChoiceFunction? = null
) {

    /**
    * The type of the tool. If type is `function`, the function name must be set
    * Values: function,code_interpreter,file_search
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        function("function"),
        code_interpreter("code_interpreter"),
        file_search("file_search");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssistantsApiToolChoiceOption'")
            }
        }
    }

}

