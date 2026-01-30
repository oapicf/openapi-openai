package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner
import org.openapitools.model.RealtimeSessionInputAudioTranscription
import org.openapitools.model.RealtimeSessionModel
import org.openapitools.model.RealtimeSessionTurnDetection
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
 * Realtime session object configuration.
 * @param id Unique identifier for the session object. 
 * @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
 * @param model 
 * @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
 * @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
 * @param inputAudioFormat The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @param outputAudioFormat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @param inputAudioTranscription 
 * @param turnDetection 
 * @param tools Tools (functions) available to the model.
 * @param toolChoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
 * @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
 * @param maxResponseOutputTokens 
 */
data class RealtimeSession(

    @Schema(example = "null", description = "Unique identifier for the session object. ")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. ")
    @get:JsonProperty("modalities") val modalities: kotlin.collections.List<RealtimeSession.Modalities>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("model") val model: RealtimeSessionModel? = null,

    @Schema(example = "null", description = "The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. ")
    @get:JsonProperty("instructions") val instructions: kotlin.String? = null,

    @Schema(example = "null", description = "The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. ")
    @get:JsonProperty("voice") val voice: RealtimeSession.Voice? = null,

    @Schema(example = "null", description = "The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")
    @get:JsonProperty("input_audio_format") val inputAudioFormat: RealtimeSession.InputAudioFormat? = null,

    @Schema(example = "null", description = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")
    @get:JsonProperty("output_audio_format") val outputAudioFormat: RealtimeSession.OutputAudioFormat? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("input_audio_transcription") val inputAudioTranscription: RealtimeSessionInputAudioTranscription? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("turn_detection") val turnDetection: RealtimeSessionTurnDetection? = null,

    @field:Valid
    @Schema(example = "null", description = "Tools (functions) available to the model.")
    @get:JsonProperty("tools") val tools: kotlin.collections.List<RealtimeResponseCreateParamsToolsInner>? = null,

    @Schema(example = "null", description = "How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. ")
    @get:JsonProperty("tool_choice") val toolChoice: kotlin.String? = null,

    @Schema(example = "null", description = "Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. ")
    @get:JsonProperty("temperature") val temperature: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("max_response_output_tokens") val maxResponseOutputTokens: RealtimeResponseCreateParamsMaxResponseOutputTokens? = null
) {

    /**
    * The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
    * Values: text,audio
    */
    enum class Modalities(@get:JsonValue val value: kotlin.String) {

        text("text"),
        audio("audio");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Modalities {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeSession'")
            }
        }
    }

    /**
    * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeSession'")
            }
        }
    }

    /**
    * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
    * Values: pcm16,g711_ulaw,g711_alaw
    */
    enum class InputAudioFormat(@get:JsonValue val value: kotlin.String) {

        pcm16("pcm16"),
        g711_ulaw("g711_ulaw"),
        g711_alaw("g711_alaw");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): InputAudioFormat {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeSession'")
            }
        }
    }

    /**
    * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
    * Values: pcm16,g711_ulaw,g711_alaw
    */
    enum class OutputAudioFormat(@get:JsonValue val value: kotlin.String) {

        pcm16("pcm16"),
        g711_ulaw("g711_ulaw"),
        g711_alaw("g711_alaw");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OutputAudioFormat {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeSession'")
            }
        }
    }

}

