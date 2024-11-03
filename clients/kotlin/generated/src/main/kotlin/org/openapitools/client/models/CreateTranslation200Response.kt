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

import org.openapitools.client.models.CreateTranslationResponseJson
import org.openapitools.client.models.CreateTranslationResponseVerboseJson
import org.openapitools.client.models.TranscriptionSegment

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param text The translated text.
 * @param language The language of the output translation (always `english`).
 * @param duration The duration of the input audio.
 * @param segments Segments of the translated text and their corresponding details.
 */


data class CreateTranslation200Response (

    /* The translated text. */
    @Json(name = "text")
    val text: kotlin.String,

    /* The language of the output translation (always `english`). */
    @Json(name = "language")
    val language: kotlin.String,

    /* The duration of the input audio. */
    @Json(name = "duration")
    val duration: kotlin.String,

    /* Segments of the translated text and their corresponding details. */
    @Json(name = "segments")
    val segments: kotlin.collections.List<TranscriptionSegment>? = null

) {


}

