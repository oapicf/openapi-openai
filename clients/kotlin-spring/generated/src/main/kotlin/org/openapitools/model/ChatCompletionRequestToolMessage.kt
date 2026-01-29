package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param role The role of the messages author, in this case `tool`.
 * @param content The contents of the tool message.
 * @param toolCallId Tool call that this message is responding to.
 */
data class ChatCompletionRequestToolMessage(

    @Schema(example = "null", required = true, description = "The role of the messages author, in this case `tool`.")
    @get:JsonProperty("role", required = true) val role: ChatCompletionRequestToolMessage.Role,

    @Schema(example = "null", required = true, description = "The contents of the tool message.")
    @get:JsonProperty("content", required = true) val content: kotlin.String,

    @Schema(example = "null", required = true, description = "Tool call that this message is responding to.")
    @get:JsonProperty("tool_call_id", required = true) val toolCallId: kotlin.String
) {

    /**
    * The role of the messages author, in this case `tool`.
    * Values: tool
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        tool("tool");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ChatCompletionRequestToolMessage'")
            }
        }
    }

}

