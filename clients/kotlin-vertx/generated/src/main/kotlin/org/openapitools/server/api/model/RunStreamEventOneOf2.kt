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
package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunObject

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
 * @param event 
 * @param &#x60;data&#x60; 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class RunStreamEventOneOf2 (
    @SerializedName("event") private val _event: RunStreamEventOneOf2.Event?,
    @SerializedName("`data`") private val _`data`: RunObject?
) {

    /**
    * 
    * Values: threadPeriodRunPeriodIn_progress
    */
    enum class Event(val value: kotlin.String){
    
        threadPeriodRunPeriodIn_progress("thread.run.in_progress");
    
    }

        val event get() = _event ?: throw IllegalArgumentException("event is required")
                    
        val `data` get() = _`data` ?: throw IllegalArgumentException("`data` is required")
                    
}

