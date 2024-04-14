package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ChatCompletionMessageToolCallFunction
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
 * @param id The ID of the tool call.
 * @param type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
data class ChatCompletionMessageToolCall(

    @Schema(example = "null", required = true, description = "The ID of the tool call.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The type of the tool. Currently, only `function` is supported.")
    @get:JsonProperty("type", required = true) val type: ChatCompletionMessageToolCall.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("function", required = true) val function: ChatCompletionMessageToolCallFunction
) {

    /**
    * The type of the tool. Currently, only `function` is supported.
    * Values: function
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("function") function("function")
    }

}

