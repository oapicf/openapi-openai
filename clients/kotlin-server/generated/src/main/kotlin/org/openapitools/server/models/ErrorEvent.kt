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

import org.openapitools.server.models.Error

/**
 * Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
 * @param event 
 * @param `data` 
 */
data class ErrorEvent(
    val event: ErrorEvent.Event,
    val `data`: Error
) 
{
    /**
    * 
    * Values: error
    */
    enum class Event(val value: kotlin.String){
        error("error");
    }
}
