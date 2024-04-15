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

import org.openapitools.server.models.ThreadObject

/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 * @param event 
 * @param `data` 
 */
data class ThreadStreamEventOneOf(
    val event: ThreadStreamEventOneOf.Event,
    val `data`: ThreadObject
) 
{
    /**
    * 
    * Values: threadPeriodCreated
    */
    enum class Event(val value: kotlin.String){
        threadPeriodCreated("thread.created");
    }
}
