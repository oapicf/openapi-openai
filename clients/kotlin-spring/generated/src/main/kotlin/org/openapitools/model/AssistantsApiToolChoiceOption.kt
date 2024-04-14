package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssistantsApiNamedToolChoice
import org.openapitools.model.ChatCompletionNamedToolChoiceFunction
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
 * Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
 * @param type The type of the tool. If type is `function`, the function name must be set
 * @param function 
 */
data class AssistantsApiToolChoiceOption(

    @Schema(example = "null", required = true, description = "The type of the tool. If type is `function`, the function name must be set")
    @get:JsonProperty("type", required = true) val type: AssistantsApiToolChoiceOption.Type,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("function") val function: ChatCompletionNamedToolChoiceFunction? = null
) {

    /**
    * The type of the tool. If type is `function`, the function name must be set
    * Values: function,code_interpreter,retrieval
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("function") function("function"),
        @JsonProperty("code_interpreter") code_interpreter("code_interpreter"),
        @JsonProperty("retrieval") retrieval("retrieval")
    }

}

