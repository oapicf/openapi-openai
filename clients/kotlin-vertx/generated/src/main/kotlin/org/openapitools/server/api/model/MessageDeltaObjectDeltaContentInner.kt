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

import org.openapitools.server.api.model.MessageDeltaContentImageFileObject
import org.openapitools.server.api.model.MessageDeltaContentImageFileObjectImageFile
import org.openapitools.server.api.model.MessageDeltaContentTextObject
import org.openapitools.server.api.model.MessageDeltaContentTextObjectText

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param index The index of the content part in the message.
 * @param type Always `image_file`.
 * @param imageFile 
 * @param text 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageDeltaObjectDeltaContentInner (
    /* The index of the content part in the message. */
    @SerializedName("index") private val _index: kotlin.Int?,
    /* Always `image_file`. */
    @SerializedName("type") private val _type: MessageDeltaObjectDeltaContentInner.Type?,
    val imageFile: MessageDeltaContentImageFileObjectImageFile? = null,
    val text: MessageDeltaContentTextObjectText? = null
) {

    /**
    * Always `image_file`.
    * Values: image_file,text
    */
    enum class Type(val value: kotlin.String){
    
        image_file("image_file"),
    
        text("text");
    
    }

        val index get() = _index ?: throw IllegalArgumentException("index is required")
                    
        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
}

