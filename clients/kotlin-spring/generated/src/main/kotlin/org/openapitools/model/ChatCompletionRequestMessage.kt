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
 * @param role The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
 * @param content The contents of the message. `content` is required for all messages except assistant messages with function calls.
 * @param name The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
 * @param functionCall 
 */
data class ChatCompletionRequestMessage(

    @Schema(example = "null", required = true, description = "The role of the messages author. One of `system`, `user`, `assistant`, or `function`.")
    @get:JsonProperty("role", required = true) val role: ChatCompletionRequestMessage.Role,

    @Schema(example = "null", description = "The contents of the message. `content` is required for all messages except assistant messages with function calls.")
    @get:JsonProperty("content") val content: kotlin.String? = null,

    @Schema(example = "null", description = "The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("function_call") val functionCall: ChatCompletionRequestMessageFunctionCall? = null
) {

    /**
    * The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
    * Values: system,user,assistant,function
    */
    enum class Role(val value: kotlin.String) {

        @JsonProperty("system") system("system"),
        @JsonProperty("user") user("user"),
        @JsonProperty("assistant") assistant("assistant"),
        @JsonProperty("function") function("function")
    }

}

