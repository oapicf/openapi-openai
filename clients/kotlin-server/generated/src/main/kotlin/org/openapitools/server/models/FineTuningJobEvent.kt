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
 * Fine-tuning job event object
 * @param id 
 * @param createdAt 
 * @param level 
 * @param message 
 * @param `object` 
 */
data class FineTuningJobEvent(
    val id: kotlin.String,
    val createdAt: kotlin.Int,
    val level: FineTuningJobEvent.Level,
    val message: kotlin.String,
    val `object`: FineTuningJobEvent.`Object`
) 
{
    /**
    * 
    * Values: info,warn,error
    */
    enum class Level(val value: kotlin.String){
        info("info"),
        warn("warn"),
        error("error");
    }
    /**
    * 
    * Values: fine_tuningPeriodJobPeriodEvent
    */
    enum class `Object`(val value: kotlin.String){
        fine_tuningPeriodJobPeriodEvent("fine_tuning.job.event");
    }
}

