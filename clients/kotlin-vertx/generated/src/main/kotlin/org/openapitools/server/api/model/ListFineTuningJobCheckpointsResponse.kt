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

import org.openapitools.server.api.model.FineTuningJobCheckpoint

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param &#x60;data&#x60; 
 * @param &#x60;object&#x60; 
 * @param hasMore 
 * @param firstId 
 * @param lastId 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class ListFineTuningJobCheckpointsResponse (
    @SerializedName("`data`") private val _`data`: kotlin.Array<FineTuningJobCheckpoint>?,
    @SerializedName("`object`") private val _`object`: ListFineTuningJobCheckpointsResponse.&#x60;Object&#x60;?,
    @SerializedName("hasMore") private val _hasMore: kotlin.Boolean?,
    val firstId: kotlin.String? = null,
    val lastId: kotlin.String? = null
) {

    /**
    * 
    * Values: list
    */
    enum class &#x60;Object&#x60;(val value: kotlin.String){
    
        list("list");
    
    }

        val `data` get() = _`data` ?: throw IllegalArgumentException("`data` is required")
                    
        val `object` get() = _`object` ?: throw IllegalArgumentException("`object` is required")
                    
        val hasMore get() = _hasMore ?: throw IllegalArgumentException("hasMore is required")
                    
}
