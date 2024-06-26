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
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
 * @param event 
 * @param `data` 
 */
data class RunStreamEventOneOf3(
    val event: RunStreamEventOneOf3.Event,
    val `data`: RunObject
) 
{
    /**
    * 
    * Values: threadPeriodRunPeriodRequires_action
    */
    enum class Event(val value: kotlin.String){
        threadPeriodRunPeriodRequires_action("thread.run.requires_action");
    }
}

