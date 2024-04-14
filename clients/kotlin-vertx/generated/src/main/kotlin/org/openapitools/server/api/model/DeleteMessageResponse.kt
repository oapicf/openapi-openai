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


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param id 
 * @param deleted 
 * @param &#x60;object&#x60; 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class DeleteMessageResponse (
    @SerializedName("id") private val _id: kotlin.String?,
    @SerializedName("deleted") private val _deleted: kotlin.Boolean?,
    @SerializedName("`object`") private val _`object`: DeleteMessageResponse.&#x60;Object&#x60;?
) {

    /**
    * 
    * Values: threadPeriodMessagePeriodDeleted
    */
    enum class &#x60;Object&#x60;(val value: kotlin.String){
    
        threadPeriodMessagePeriodDeleted("thread.message.deleted");
    
    }

        val id get() = _id ?: throw IllegalArgumentException("id is required")
                    
        val deleted get() = _deleted ?: throw IllegalArgumentException("deleted is required")
                    
        val `object` get() = _`object` ?: throw IllegalArgumentException("`object` is required")
                    
}

