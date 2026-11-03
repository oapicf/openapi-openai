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
 * @param role The role of the messages author, in this case `function`.
 * @param content The contents of the function message.
 * @param name The name of the function to call.
 */
data class ChatCompletionRequestFunctionMessage(

    @Schema(required = true, description = "The role of the messages author, in this case `function`.")
    @param:JsonProperty("role", required = true)
    @get:JsonProperty("role", required = true) val role: ChatCompletionRequestFunctionMessage.Role,

    @Schema(required = true, description = "The contents of the function message.")
    @param:JsonProperty("content", required = true)
    @get:JsonProperty("content", required = true) val content: kotlin.String?,

    @Schema(required = true, description = "The name of the function to call.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String
) : ChatCompletionRequestMessage, FineTuneChatRequestInputMessagesInner {

    /**
    * The role of the messages author, in this case `function`.
    * Values: function
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        function("function");
    
        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Role'")
            }
        }
    }

}

