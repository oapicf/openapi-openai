package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeConversationItem
import org.openapitools.model.RealtimeResponseCreateParamsConversation
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner
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
 * Create a new Realtime response with these parameters
 * @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
 * @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
 * @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
 * @param outputAudioFormat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @param tools Tools (functions) available to the model.
 * @param toolChoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
 * @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
 * @param maxResponseOutputTokens 
 * @param conversation 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @param input Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
 */
data class RealtimeResponseCreateParams(

    @Schema(example = "null", description = "The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. ")
    @get:JsonProperty("modalities") val modalities: kotlin.collections.List<RealtimeResponseCreateParams.Modalities>? = null,

    @Schema(example = "null", description = "The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. ")
    @get:JsonProperty("instructions") val instructions: kotlin.String? = null,

    @Schema(example = "null", description = "The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. ")
    @get:JsonProperty("voice") val voice: RealtimeResponseCreateParams.Voice? = null,

    @Schema(example = "null", description = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")
    @get:JsonProperty("output_audio_format") val outputAudioFormat: RealtimeResponseCreateParams.OutputAudioFormat? = null,

    @field:Valid
    @Schema(example = "null", description = "Tools (functions) available to the model.")
    @get:JsonProperty("tools") val tools: kotlin.collections.List<RealtimeResponseCreateParamsToolsInner>? = null,

    @Schema(example = "null", description = "How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. ")
    @get:JsonProperty("tool_choice") val toolChoice: kotlin.String? = null,

    @Schema(example = "null", description = "Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. ")
    @get:JsonProperty("temperature") val temperature: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("max_response_output_tokens") val maxResponseOutputTokens: RealtimeResponseCreateParamsMaxResponseOutputTokens? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("conversation") val conversation: RealtimeResponseCreateParamsConversation? = null,

    @field:Valid
    @Schema(example = "null", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @get:JsonProperty("metadata") val metadata: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. ")
    @get:JsonProperty("input") val input: kotlin.collections.List<RealtimeConversationItem>? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeResponseCreateParams'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeResponseCreateParams'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeResponseCreateParams'")
            }
        }
    }

}

