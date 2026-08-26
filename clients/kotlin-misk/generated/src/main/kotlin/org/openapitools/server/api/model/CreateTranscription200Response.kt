package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateTranscriptionResponseJson
import org.openapitools.server.api.model.CreateTranscriptionResponseVerboseJson
import org.openapitools.server.api.model.TranscriptionSegment
import org.openapitools.server.api.model.TranscriptionWord
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateTranscription200Response(
    /** The transcribed text. */
    val text: kotlin.String,
    /** The language of the input audio. */
    val language: kotlin.String,
    /** The duration of the input audio. */
    val duration: kotlin.String,
    /** Extracted words and their corresponding timestamps. */
    val words: kotlin.collections.List<TranscriptionWord>? = null,
    /** Segments of the transcribed text and their corresponding details. */
    val segments: kotlin.collections.List<TranscriptionSegment>? = null
)
