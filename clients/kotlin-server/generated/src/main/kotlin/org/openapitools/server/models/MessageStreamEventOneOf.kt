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

import org.openapitools.server.models.MessageObject

/**
 * Occurs when a [message](/docs/api-reference/messages/object) is created.
 * @param event 
 * @param `data` 
 */
data class MessageStreamEventOneOf(
    val event: MessageStreamEventOneOf.Event,
    val `data`: MessageObject
) 
{
    /**
    * 
    * Values: threadPeriodMessagePeriodCreated
    */
    enum class Event(val value: kotlin.String){
        threadPeriodMessagePeriodCreated("thread.message.created");
    }
}
