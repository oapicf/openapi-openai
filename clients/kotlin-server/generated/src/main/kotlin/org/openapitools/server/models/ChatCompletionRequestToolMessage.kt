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


/**
 * 
 * @param role The role of the messages author, in this case `tool`.
 * @param content The contents of the tool message.
 * @param toolCallId Tool call that this message is responding to.
 */
data class ChatCompletionRequestToolMessage(
    /* The role of the messages author, in this case `tool`. */
    val role: ChatCompletionRequestToolMessage.Role,
    /* The contents of the tool message. */
    val content: kotlin.String,
    /* Tool call that this message is responding to. */
    val toolCallId: kotlin.String
) 
{
    /**
    * The role of the messages author, in this case `tool`.
    * Values: tool
    */
    enum class Role(val value: kotlin.String){
        tool("tool");
    }
}

