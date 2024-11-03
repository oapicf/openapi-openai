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

import org.openapitools.server.api.model.MessageObject
import org.openapitools.server.api.model.MessageStreamEventOneOf
import org.openapitools.server.api.model.MessageStreamEventOneOf1
import org.openapitools.server.api.model.MessageStreamEventOneOf2
import org.openapitools.server.api.model.MessageStreamEventOneOf3
import org.openapitools.server.api.model.MessageStreamEventOneOf4

        
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
data class MessageStreamEvent (
    @SerializedName("event") private val _event: MessageStreamEvent.Event?,
    @SerializedName("`data`") private val _`data`: MessageObject?
) {

    /**
    * 
    * Values: threadPeriodMessagePeriodIncomplete
    */
    enum class Event(val value: kotlin.String){
    
        threadPeriodMessagePeriodIncomplete("thread.message.incomplete");
    
    }

        val event get() = _event ?: throw IllegalArgumentException("event is required")
                    
        val `data` get() = _`data` ?: throw IllegalArgumentException("`data` is required")
                    
}

