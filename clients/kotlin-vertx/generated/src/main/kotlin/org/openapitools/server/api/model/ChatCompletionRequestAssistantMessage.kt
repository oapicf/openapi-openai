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

import org.openapitools.server.api.model.ChatCompletionMessageToolCall
import org.openapitools.server.api.model.ChatCompletionRequestAssistantMessageFunctionCall

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param role The role of the messages author, in this case `assistant`.
 * @param content The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 * @param toolCalls The tool calls generated by the model, such as function calls.
 * @param functionCall 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class ChatCompletionRequestAssistantMessage (
    /* The role of the messages author, in this case `assistant`. */
    @SerializedName("role") private val _role: ChatCompletionRequestAssistantMessage.Role?,
    /* The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified.  */
    val content: kotlin.String? = null,
    /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    val name: kotlin.String? = null,
    /* The tool calls generated by the model, such as function calls. */
    val toolCalls: kotlin.Array<ChatCompletionMessageToolCall>? = null,
    val functionCall: ChatCompletionRequestAssistantMessageFunctionCall? = null
) {

    /**
    * The role of the messages author, in this case `assistant`.
    * Values: assistant
    */
    enum class Role(val value: kotlin.String){
    
        assistant("assistant");
    
    }

        val role get() = _role ?: throw IllegalArgumentException("role is required")
                    
}

