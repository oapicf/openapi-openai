/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.CreateTranscriptionResponseJson
import org.openapitools.server.models.CreateTranscriptionResponseVerboseJson
import org.openapitools.server.models.TranscriptionSegment
import org.openapitools.server.models.TranscriptionWord

/**
 * 
 * @param text The transcribed text.
 * @param language The language of the input audio.
 * @param duration The duration of the input audio.
 * @param words Extracted words and their corresponding timestamps.
 * @param segments Segments of the transcribed text and their corresponding details.
 */
data class CreateTranscription200Response(
    /* The transcribed text. */
    val text: kotlin.String,
    /* The language of the input audio. */
    val language: kotlin.String,
    /* The duration of the input audio. */
    val duration: kotlin.String,
    /* Extracted words and their corresponding timestamps. */
    val words: kotlin.collections.List<TranscriptionWord>? = null,
    /* Segments of the transcribed text and their corresponding details. */
    val segments: kotlin.collections.List<TranscriptionSegment>? = null
) 

