package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreateSpeechRequestModel
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
 * @param model 
 * @param input The text to generate audio for. The maximum length is 4096 characters.
 * @param voice The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
 * @param responseFormat The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
 * @param speed The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
 */
data class CreateSpeechRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("model", required = true) val model: CreateSpeechRequestModel,

    @get:Size(max=4096)
    @Schema(example = "null", required = true, description = "The text to generate audio for. The maximum length is 4096 characters.")
    @get:JsonProperty("input", required = true) val input: kotlin.String,

    @Schema(example = "null", required = true, description = "The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).")
    @get:JsonProperty("voice", required = true) val voice: CreateSpeechRequest.Voice,

    @Schema(example = "null", description = "The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.")
    @get:JsonProperty("response_format") val responseFormat: CreateSpeechRequest.ResponseFormat? = ResponseFormat.mp3,

    @get:DecimalMin("0.25")
    @get:DecimalMax("4.0")
    @Schema(example = "null", description = "The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.")
    @get:JsonProperty("speed") val speed: java.math.BigDecimal? = java.math.BigDecimal("1.0")
    ) {

    /**
    * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
    * Values: alloy,echo,fable,onyx,nova,shimmer
    */
    enum class Voice(@get:JsonValue val value: kotlin.String) {

        alloy("alloy"),
        echo("echo"),
        fable("fable"),
        onyx("onyx"),
        nova("nova"),
        shimmer("shimmer");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Voice {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
    * Values: mp3,opus,aac,flac,wav,pcm
    */
    enum class ResponseFormat(@get:JsonValue val value: kotlin.String) {

        mp3("mp3"),
        opus("opus"),
        aac("aac"),
        flac("flac"),
        wav("wav"),
        pcm("pcm");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ResponseFormat {
                return values().first{it -> it.value == value}
            }
        }
    }

}

