@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateTranscription200Response(
    @field:JsonProperty("text")
    val text: kotlin.String,

    @field:JsonProperty("language")
    val language: kotlin.String,

    @field:JsonProperty("duration")
    val duration: kotlin.String,

    @field:JsonProperty("words")
    val words: kotlin.collections.List<TranscriptionWord>? = null,

    @field:JsonProperty("segments")
    val segments: kotlin.collections.List<TranscriptionSegment>? = null,

)
