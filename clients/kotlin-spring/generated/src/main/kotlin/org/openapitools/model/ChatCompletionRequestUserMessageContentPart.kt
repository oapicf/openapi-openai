package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ChatCompletionRequestMessageContentPartAudio
import org.openapitools.model.ChatCompletionRequestMessageContentPartAudioInputAudio
import org.openapitools.model.ChatCompletionRequestMessageContentPartImage
import org.openapitools.model.ChatCompletionRequestMessageContentPartImageImageUrl
import org.openapitools.model.ChatCompletionRequestMessageContentPartText
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
 * @param type The type of the content part.
 * @param text The text content.
 * @param imageUrl 
 * @param inputAudio 
 */
data class ChatCompletionRequestUserMessageContentPart(

    @Schema(example = "null", required = true, description = "The type of the content part.")
    @get:JsonProperty("type", required = true) val type: ChatCompletionRequestUserMessageContentPart.Type,

    @Schema(example = "null", required = true, description = "The text content.")
    @get:JsonProperty("text", required = true) val text: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("image_url", required = true) val imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("input_audio", required = true) val inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio
) {

    /**
    * The type of the content part.
    * Values: text,image_url,input_audio
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        text("text"),
        image_url("image_url"),
        input_audio("input_audio");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ChatCompletionRequestUserMessageContentPart'")
            }
        }
    }

}

