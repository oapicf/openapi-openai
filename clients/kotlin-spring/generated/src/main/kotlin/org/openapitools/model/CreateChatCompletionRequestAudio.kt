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
 * Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
 * @param voice The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
 * @param format Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
 */
data class CreateChatCompletionRequestAudio(

    @Schema(example = "null", required = true, description = "The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). ")
    @get:JsonProperty("voice", required = true) val voice: CreateChatCompletionRequestAudio.Voice,

    @Schema(example = "null", required = true, description = "Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. ")
    @get:JsonProperty("format", required = true) val format: CreateChatCompletionRequestAudio.Format
) {

    /**
    * The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
    * Values: alloy,ash,ballad,coral,echo,sage,shimmer,verse
    */
    enum class Voice(@get:JsonValue val value: kotlin.String) {

        alloy("alloy"),
        ash("ash"),
        ballad("ballad"),
        coral("coral"),
        echo("echo"),
        sage("sage"),
        shimmer("shimmer"),
        verse("verse");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Voice {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateChatCompletionRequestAudio'")
            }
        }
    }

    /**
    * Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
    * Values: wav,mp3,flac,opus,pcm16
    */
    enum class Format(@get:JsonValue val value: kotlin.String) {

        wav("wav"),
        mp3("mp3"),
        flac("flac"),
        opus("opus"),
        pcm16("pcm16");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Format {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateChatCompletionRequestAudio'")
            }
        }
    }

}

