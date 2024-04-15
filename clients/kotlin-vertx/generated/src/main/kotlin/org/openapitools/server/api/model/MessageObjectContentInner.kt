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

import org.openapitools.server.api.model.MessageContentImageFileObject
import org.openapitools.server.api.model.MessageContentImageFileObjectImageFile
import org.openapitools.server.api.model.MessageContentTextObject
import org.openapitools.server.api.model.MessageContentTextObjectText

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param type Always `image_file`.
 * @param imageFile 
 * @param text 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageObjectContentInner (
    /* Always `image_file`. */
    @SerializedName("type") private val _type: MessageObjectContentInner.Type?,
    @SerializedName("imageFile") private val _imageFile: MessageContentImageFileObjectImageFile?,
    @SerializedName("text") private val _text: MessageContentTextObjectText?
) {

    /**
    * Always `image_file`.
    * Values: image_file,text
    */
    enum class Type(val value: kotlin.String){
    
        image_file("image_file"),
    
        text("text");
    
    }

        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val imageFile get() = _imageFile ?: throw IllegalArgumentException("imageFile is required")
                    
        val text get() = _text ?: throw IllegalArgumentException("text is required")
                    
}
