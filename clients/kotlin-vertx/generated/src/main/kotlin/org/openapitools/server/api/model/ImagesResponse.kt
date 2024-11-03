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

import org.openapitools.server.api.model.Image

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param created 
 * @param &#x60;data&#x60; 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class ImagesResponse (
    @SerializedName("created") private val _created: kotlin.Int?,
    @SerializedName("`data`") private val _`data`: kotlin.Array<Image>?
) {

        val created get() = _created ?: throw IllegalArgumentException("created is required")
                    
        val `data` get() = _`data` ?: throw IllegalArgumentException("`data` is required")
                    
}

