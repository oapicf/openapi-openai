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

import org.openapitools.server.models.RunStepObject

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
 * @param event 
 * @param `data` 
 */
data class RunStepStreamEventOneOf5(
    val event: RunStepStreamEventOneOf5.Event,
    val `data`: RunStepObject
) 
{
    /**
    * 
    * Values: threadPeriodRunPeriodStepPeriodCancelled
    */
    enum class Event(val value: kotlin.String){
        threadPeriodRunPeriodStepPeriodCancelled("thread.run.step.cancelled");
    }
}

