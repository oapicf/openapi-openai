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
import org.openapitools.server.models.MessageStreamEventOneOf
import org.openapitools.server.models.MessageStreamEventOneOf1
import org.openapitools.server.models.MessageStreamEventOneOf2
import org.openapitools.server.models.MessageStreamEventOneOf3
import org.openapitools.server.models.MessageStreamEventOneOf4

/**
 * 
 * @param event 
 * @param `data` 
 */
data class MessageStreamEvent(
    val event: MessageStreamEvent.Event,
    val `data`: MessageObject
) 
{
    /**
    * 
    * Values: threadPeriodMessagePeriodIncomplete
    */
    enum class Event(val value: kotlin.String){
        threadPeriodMessagePeriodIncomplete("thread.message.incomplete");
    }
}

