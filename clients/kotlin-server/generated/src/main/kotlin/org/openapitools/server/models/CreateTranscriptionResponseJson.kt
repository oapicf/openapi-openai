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


/**
 * Represents a transcription response returned by model, based on the provided input.
 * @param text The transcribed text.
 */
data class CreateTranscriptionResponseJson(
    /* The transcribed text. */
    val text: kotlin.String
) 

