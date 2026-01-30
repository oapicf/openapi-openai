package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ChatCompletionRequestMessageContentPartAudioInputAudio
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
 * Learn about [audio inputs](/docs/guides/audio). 
 * @param type The type of the content part. Always `input_audio`.
 * @param inputAudio 
 */
data class ChatCompletionRequestMessageContentPartAudio(

    @Schema(example = "null", required = true, description = "The type of the content part. Always `input_audio`.")
    @get:JsonProperty("type", required = true) val type: ChatCompletionRequestMessageContentPartAudio.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("input_audio", required = true) val inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio
) {

    /**
    * The type of the content part. Always `input_audio`.
    * Values: input_audio
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        input_audio("input_audio");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ChatCompletionRequestMessageContentPartAudio'")
            }
        }
    }

}

