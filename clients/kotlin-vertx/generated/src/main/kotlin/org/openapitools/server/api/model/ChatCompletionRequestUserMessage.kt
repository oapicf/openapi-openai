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

import org.openapitools.server.api.model.ChatCompletionRequestUserMessageContent

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param content 
 * @param role The role of the messages author, in this case `user`.
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class ChatCompletionRequestUserMessage (
    @SerializedName("content") private val _content: ChatCompletionRequestUserMessageContent?,
    /* The role of the messages author, in this case `user`. */
    @SerializedName("role") private val _role: ChatCompletionRequestUserMessage.Role?,
    /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    val name: kotlin.String? = null
) {

    /**
    * The role of the messages author, in this case `user`.
    * Values: user
    */
    enum class Role(val value: kotlin.String){
    
        user("user");
    
    }

        val content get() = _content ?: throw IllegalArgumentException("content is required")
                    
        val role get() = _role ?: throw IllegalArgumentException("role is required")
                    
}

