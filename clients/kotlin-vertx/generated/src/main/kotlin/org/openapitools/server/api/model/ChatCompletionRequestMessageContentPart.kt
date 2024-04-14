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

import org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartImage
import org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartImageImageUrl
import org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartText

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param type The type of the content part.
 * @param text The text content.
 * @param imageUrl 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class ChatCompletionRequestMessageContentPart (
    /* The type of the content part. */
    @SerializedName("type") private val _type: ChatCompletionRequestMessageContentPart.Type?,
    /* The text content. */
    @SerializedName("text") private val _text: kotlin.String?,
    @SerializedName("imageUrl") private val _imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl?
) {

    /**
    * The type of the content part.
    * Values: text,image_url
    */
    enum class Type(val value: kotlin.String){
    
        text("text"),
    
        image_url("image_url");
    
    }

        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val text get() = _text ?: throw IllegalArgumentException("text is required")
                    
        val imageUrl get() = _imageUrl ?: throw IllegalArgumentException("imageUrl is required")
                    
}

