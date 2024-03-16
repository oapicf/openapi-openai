package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall
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
 * @param role The role of the author of this message.
 * @param content The contents of the chunk message.
 * @param functionCall 
 */
data class ChatCompletionStreamResponseDelta(

    @Schema(example = "null", description = "The role of the author of this message.")
    @get:JsonProperty("role") val role: ChatCompletionStreamResponseDelta.Role? = null,

    @Schema(example = "null", description = "The contents of the chunk message.")
    @get:JsonProperty("content") val content: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("function_call") val functionCall: ChatCompletionRequestMessageFunctionCall? = null
) {

    /**
    * The role of the author of this message.
    * Values: system,user,assistant,function
    */
    enum class Role(val value: kotlin.String) {

        @JsonProperty("system") system("system"),
        @JsonProperty("user") user("user"),
        @JsonProperty("assistant") assistant("assistant"),
        @JsonProperty("function") function("function")
    }

}

