@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeSessionCreateRequest(
    @field:JsonProperty("model")
    val model: kotlin.String,

    @field:JsonProperty("modalities")
    val modalities: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("instructions")
    val instructions: kotlin.String? = null,

    @field:JsonProperty("voice")
    val voice: kotlin.String? = null,

    @field:JsonProperty("input_audio_format")
    val inputAudioFormat: kotlin.String? = null,

    @field:JsonProperty("output_audio_format")
    val outputAudioFormat: kotlin.String? = null,

    @field:JsonProperty("input_audio_transcription")
    val inputAudioTranscription: RealtimeSessionInputAudioTranscription? = null,

    @field:JsonProperty("turn_detection")
    val turnDetection: RealtimeSessionCreateRequestTurnDetection? = null,

    @field:JsonProperty("tools")
    val tools: kotlin.collections.List<RealtimeResponseCreateParamsToolsInner>? = null,

    @field:JsonProperty("tool_choice")
    val toolChoice: kotlin.String? = null,

    @field:JsonProperty("temperature")
    val temperature: java.math.BigDecimal? = null,

    @field:JsonProperty("max_response_output_tokens")
    val maxResponseOutputTokens: RealtimeResponseCreateParamsMaxResponseOutputTokens? = null,

)
