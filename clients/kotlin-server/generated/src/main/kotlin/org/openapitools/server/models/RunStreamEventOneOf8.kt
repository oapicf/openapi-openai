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

import org.openapitools.server.models.RunObject

/**
 * Occurs when a [run](/docs/api-reference/runs/object) expires.
 * @param event 
 * @param `data` 
 */
data class RunStreamEventOneOf8(
    val event: RunStreamEventOneOf8.Event,
    val `data`: RunObject
) 
{
    /**
    * 
    * Values: threadPeriodRunPeriodExpired
    */
    enum class Event(val value: kotlin.String){
        threadPeriodRunPeriodExpired("thread.run.expired");
    }
}

