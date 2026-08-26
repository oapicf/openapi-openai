package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateTranscriptionResponseJson(
    /** The transcribed text. */
    val text: kotlin.String
)
