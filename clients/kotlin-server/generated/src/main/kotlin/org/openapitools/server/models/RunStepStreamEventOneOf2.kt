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

import org.openapitools.server.models.RunStepDeltaObject

/**
 * Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
 * @param event 
 * @param `data` 
 */
data class RunStepStreamEventOneOf2(
    val event: RunStepStreamEventOneOf2.Event,
    val `data`: RunStepDeltaObject
) 
{
    /**
    * 
    * Values: threadPeriodRunPeriodStepPeriodDelta
    */
    enum class Event(val value: kotlin.String){
        threadPeriodRunPeriodStepPeriodDelta("thread.run.step.delta");
    }
}
