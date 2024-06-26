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

import org.openapitools.server.models.CreateTranslationResponseJson
import org.openapitools.server.models.CreateTranslationResponseVerboseJson
import org.openapitools.server.models.TranscriptionSegment

/**
 * 
 * @param text The translated text.
 * @param language The language of the output translation (always `english`).
 * @param duration The duration of the input audio.
 * @param segments Segments of the translated text and their corresponding details.
 */
data class CreateTranslation200Response(
    /* The translated text. */
    val text: kotlin.String,
    /* The language of the output translation (always `english`). */
    val language: kotlin.String,
    /* The duration of the input audio. */
    val duration: kotlin.String,
    /* Segments of the translated text and their corresponding details. */
    val segments: kotlin.collections.List<TranscriptionSegment>? = null
) 

