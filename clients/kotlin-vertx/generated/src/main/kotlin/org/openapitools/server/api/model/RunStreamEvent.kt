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
import org.openapitools.server.api.model.RunStreamEventOneOf
import org.openapitools.server.api.model.RunStreamEventOneOf1
import org.openapitools.server.api.model.RunStreamEventOneOf2
import org.openapitools.server.api.model.RunStreamEventOneOf3
import org.openapitools.server.api.model.RunStreamEventOneOf4
import org.openapitools.server.api.model.RunStreamEventOneOf5
import org.openapitools.server.api.model.RunStreamEventOneOf6
import org.openapitools.server.api.model.RunStreamEventOneOf7
import org.openapitools.server.api.model.RunStreamEventOneOf8

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param event 
 * @param &#x60;data&#x60; 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class RunStreamEvent (
    @SerializedName("event") private val _event: RunStreamEvent.Event?,
    @SerializedName("`data`") private val _`data`: RunObject?
) {

    /**
    * 
    * Values: threadPeriodRunPeriodExpired
    */
    enum class Event(val value: kotlin.String){
    
        threadPeriodRunPeriodExpired("thread.run.expired");
    
    }

        val event get() = _event ?: throw IllegalArgumentException("event is required")
                    
        val `data` get() = _`data` ?: throw IllegalArgumentException("`data` is required")
                    
}

