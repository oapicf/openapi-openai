package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TranscriptionWord(
    /** The text content of the word. */
    val word: kotlin.String,
    /** Start time of the word in seconds. */
    val start: kotlin.Float,
    /** End time of the word in seconds. */
    val end: kotlin.Float
)
