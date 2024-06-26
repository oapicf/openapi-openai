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
package org.openapitools.server.models

import org.openapitools.server.models.ChatCompletionMessageToolCall
import org.openapitools.server.models.ChatCompletionRequestAssistantMessage
import org.openapitools.server.models.ChatCompletionRequestAssistantMessageFunctionCall
import org.openapitools.server.models.ChatCompletionRequestFunctionMessage
import org.openapitools.server.models.ChatCompletionRequestSystemMessage
import org.openapitools.server.models.ChatCompletionRequestToolMessage
import org.openapitools.server.models.ChatCompletionRequestUserMessage

/**
 * 
 * @param content The contents of the function message.
 * @param role The role of the messages author, in this case `function`.
 * @param name The name of the function to call.
 * @param toolCallId Tool call that this message is responding to.
 * @param toolCalls The tool calls generated by the model, such as function calls.
 * @param functionCall 
 */
data class ChatCompletionRequestMessage(
    /* The contents of the function message. */
    val content: kotlin.String,
    /* The role of the messages author, in this case `function`. */
    val role: ChatCompletionRequestMessage.Role,
    /* The name of the function to call. */
    val name: kotlin.String,
    /* Tool call that this message is responding to. */
    val toolCallId: kotlin.String,
    /* The tool calls generated by the model, such as function calls. */
    val toolCalls: kotlin.collections.List<ChatCompletionMessageToolCall>? = null,
    val functionCall: ChatCompletionRequestAssistantMessageFunctionCall? = null
) 
{
    /**
    * The role of the messages author, in this case `function`.
    * Values: function
    */
    enum class Role(val value: kotlin.String){
        function("function");
    }
}

