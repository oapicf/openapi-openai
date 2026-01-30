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
 * @param &#x60;data&#x60; Base64 encoded audio data.
 * @param format The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
 */
data class ChatCompletionRequestMessageContentPartAudioInputAudio(

    @Schema(example = "null", required = true, description = "Base64 encoded audio data.")
    @get:JsonProperty("data", required = true) val `data`: kotlin.String,

    @Schema(example = "null", required = true, description = "The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". ")
    @get:JsonProperty("format", required = true) val format: ChatCompletionRequestMessageContentPartAudioInputAudio.Format
) {

    /**
    * The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
    * Values: wav,mp3
    */
    enum class Format(@get:JsonValue val value: kotlin.String) {

        wav("wav"),
        mp3("mp3");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Format {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ChatCompletionRequestMessageContentPartAudioInputAudio'")
            }
        }
    }

}

