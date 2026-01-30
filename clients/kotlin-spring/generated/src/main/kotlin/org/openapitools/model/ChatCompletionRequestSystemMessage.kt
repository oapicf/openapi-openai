package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ChatCompletionRequestSystemMessageContent
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
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. 
 * @param content 
 * @param role The role of the messages author, in this case `system`.
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 */
data class ChatCompletionRequestSystemMessage(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("content", required = true) val content: ChatCompletionRequestSystemMessageContent,

    @Schema(example = "null", required = true, description = "The role of the messages author, in this case `system`.")
    @get:JsonProperty("role", required = true) val role: ChatCompletionRequestSystemMessage.Role,

    @Schema(example = "null", description = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.")
    @get:JsonProperty("name") val name: kotlin.String? = null
) {

    /**
    * The role of the messages author, in this case `system`.
    * Values: system
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        system("system");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ChatCompletionRequestSystemMessage'")
            }
        }
    }

}

