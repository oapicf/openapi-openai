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
 * Learn about [text inputs](/docs/guides/text-generation). 
 * @param type The type of the content part.
 * @param text The text content.
 */
data class ChatCompletionRequestMessageContentPartText(

    @Schema(required = true, description = "The type of the content part.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: ChatCompletionRequestMessageContentPartText.Type,

    @Schema(required = true, description = "The text content.")
    @param:JsonProperty("text")
    @get:JsonProperty("text", required = true) val text: kotlin.String
) : ChatCompletionRequestAssistantMessageContentPart, ChatCompletionRequestUserMessageContentPart {

    /**
    * The type of the content part.
    * Values: text
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

}

