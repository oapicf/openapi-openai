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

import org.openapitools.server.api.model.ThreadObject

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 * @param event 
 * @param &#x60;data&#x60; 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class ThreadStreamEventOneOf (
    @SerializedName("event") private val _event: ThreadStreamEventOneOf.Event?,
    @SerializedName("`data`") private val _`data`: ThreadObject?
) {

    /**
    * 
    * Values: threadPeriodCreated
    */
    enum class Event(val value: kotlin.String){
    
        threadPeriodCreated("thread.created");
    
    }

        val event get() = _event ?: throw IllegalArgumentException("event is required")
                    
        val `data` get() = _`data` ?: throw IllegalArgumentException("`data` is required")
                    
}

