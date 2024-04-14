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

import org.openapitools.server.api.model.MessageFileObject

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param &#x60;object&#x60; 
 * @param &#x60;data&#x60; 
 * @param firstId 
 * @param lastId 
 * @param hasMore 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class ListMessageFilesResponse (
    @SerializedName("`object`") private val _`object`: kotlin.String?,
    @SerializedName("`data`") private val _`data`: kotlin.Array<MessageFileObject>?,
    @SerializedName("firstId") private val _firstId: kotlin.String?,
    @SerializedName("lastId") private val _lastId: kotlin.String?,
    @SerializedName("hasMore") private val _hasMore: kotlin.Boolean?
) {

        val `object` get() = _`object` ?: throw IllegalArgumentException("`object` is required")
                    
        val `data` get() = _`data` ?: throw IllegalArgumentException("`data` is required")
                    
        val firstId get() = _firstId ?: throw IllegalArgumentException("firstId is required")
                    
        val lastId get() = _lastId ?: throw IllegalArgumentException("lastId is required")
                    
        val hasMore get() = _hasMore ?: throw IllegalArgumentException("hasMore is required")
                    
}

