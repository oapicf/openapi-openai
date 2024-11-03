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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a transcription response returned by model, based on the provided input.
 *
 * @param text The transcribed text.
 */


data class CreateTranscriptionResponseJson (

    /* The transcribed text. */
    @Json(name = "text")
    val text: kotlin.String

) {


}

