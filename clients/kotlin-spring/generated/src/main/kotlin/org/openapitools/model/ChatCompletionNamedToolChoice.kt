package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 * @param type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
data class ChatCompletionNamedToolChoice(

    @Schema(example = "null", required = true, description = "The type of the tool. Currently, only `function` is supported.")
    @get:JsonProperty("type", required = true) val type: ChatCompletionNamedToolChoice.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("function", required = true) val function: ChatCompletionNamedToolChoiceFunction
    ) {

    /**
    * The type of the tool. Currently, only `function` is supported.
    * Values: function
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        function("function");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().first{it -> it.value == value}
            }
        }
    }

}

