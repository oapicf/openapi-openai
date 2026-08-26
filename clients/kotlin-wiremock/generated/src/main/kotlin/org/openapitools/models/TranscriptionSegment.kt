@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TranscriptionSegment(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("seek")
    val seek: kotlin.Int,

    @field:JsonProperty("start")
    val start: kotlin.Float,

    @field:JsonProperty("end")
    val end: kotlin.Float,

    @field:JsonProperty("text")
    val text: kotlin.String,

    @field:JsonProperty("tokens")
    val tokens: kotlin.collections.List<kotlin.Int>,

    @field:JsonProperty("temperature")
    val temperature: kotlin.Float,

    @field:JsonProperty("avg_logprob")
    val avgLogprob: kotlin.Float,

    @field:JsonProperty("compression_ratio")
    val compressionRatio: kotlin.Float,

    @field:JsonProperty("no_speech_prob")
    val noSpeechProb: kotlin.Float,

)
