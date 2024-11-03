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
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 * @param event 
 * @param `data` 
 */
data class RunStreamEventOneOf(
    val event: RunStreamEventOneOf.Event,
    val `data`: RunObject
) 
{
    /**
    * 
    * Values: threadPeriodRunPeriodCreated
    */
    enum class Event(val value: kotlin.String){
        threadPeriodRunPeriodCreated("thread.run.created");
    }
}

