/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.CreateTranscriptionResponseJson
import org.openapitools.client.models.CreateTranscriptionResponseVerboseJson
import org.openapitools.client.models.TranscriptionSegment
import org.openapitools.client.models.TranscriptionWord

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param text The transcribed text.
 * @param language The language of the input audio.
 * @param duration The duration of the input audio.
 * @param words Extracted words and their corresponding timestamps.
 * @param segments Segments of the transcribed text and their corresponding details.
 */


data class CreateTranscription200Response (

    /* The transcribed text. */
    @Json(name = "text")
    val text: kotlin.String,

    /* The language of the input audio. */
    @Json(name = "language")
    val language: kotlin.String,

    /* The duration of the input audio. */
    @Json(name = "duration")
    val duration: kotlin.String,

    /* Extracted words and their corresponding timestamps. */
    @Json(name = "words")
    val words: kotlin.collections.List<TranscriptionWord>? = null,

    /* Segments of the transcribed text and their corresponding details. */
    @Json(name = "segments")
    val segments: kotlin.collections.List<TranscriptionSegment>? = null

)

