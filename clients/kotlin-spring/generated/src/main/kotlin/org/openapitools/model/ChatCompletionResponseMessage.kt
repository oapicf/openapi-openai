package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ChatCompletionMessageToolCall
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall
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
 * A chat completion message generated by the model.
 * @param content The contents of the message.
 * @param role The role of the author of this message.
 * @param toolCalls The tool calls generated by the model, such as function calls.
 * @param functionCall 
 */
data class ChatCompletionResponseMessage(

    @Schema(example = "null", required = true, description = "The contents of the message.")
    @get:JsonProperty("content", required = true) val content: kotlin.String?,

    @Schema(example = "null", required = true, description = "The role of the author of this message.")
    @get:JsonProperty("role", required = true) val role: ChatCompletionResponseMessage.Role,

    @field:Valid
    @Schema(example = "null", description = "The tool calls generated by the model, such as function calls.")
    @get:JsonProperty("tool_calls") val toolCalls: kotlin.collections.List<ChatCompletionMessageToolCall>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @Deprecated(message = "")
    @get:JsonProperty("function_call") val functionCall: ChatCompletionRequestAssistantMessageFunctionCall? = null
    ) {

    /**
    * The role of the author of this message.
    * Values: assistant
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        assistant("assistant");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().first{it -> it.value == value}
            }
        }
    }

}

