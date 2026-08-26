package org.openapitools.server.api.model

import org.openapitools.server.api.model.TranscriptionSegment
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateTranslationResponseVerboseJson(
    /** The language of the output translation (always &#x60;english&#x60;). */
    val language: kotlin.String,
    /** The duration of the input audio. */
    val duration: kotlin.String,
    /** The translated text. */
    val text: kotlin.String,
    /** Segments of the translated text and their corresponding details. */
    val segments: kotlin.collections.List<TranscriptionSegment>? = null
)
