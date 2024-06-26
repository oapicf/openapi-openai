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

import org.openapitools.server.api.model.MessageDeltaContentImageFileObjectImageFile

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 * @param index The index of the content part in the message.
 * @param type Always `image_file`.
 * @param imageFile 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageDeltaContentImageFileObject (
    /* The index of the content part in the message. */
    @SerializedName("index") private val _index: kotlin.Int?,
    /* Always `image_file`. */
    @SerializedName("type") private val _type: MessageDeltaContentImageFileObject.Type?,
    val imageFile: MessageDeltaContentImageFileObjectImageFile? = null
) {

    /**
    * Always `image_file`.
    * Values: image_file
    */
    enum class Type(val value: kotlin.String){
    
        image_file("image_file");
    
    }

        val index get() = _index ?: throw IllegalArgumentException("index is required")
                    
        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
}

