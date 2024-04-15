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

import org.openapitools.server.models.ChatCompletionMessageToolCallFunction

/**
 * 
 * @param id The ID of the tool call.
 * @param type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
data class ChatCompletionMessageToolCall(
    /* The ID of the tool call. */
    val id: kotlin.String,
    /* The type of the tool. Currently, only `function` is supported. */
    val type: ChatCompletionMessageToolCall.Type,
    val function: ChatCompletionMessageToolCallFunction
) 
{
    /**
    * The type of the tool. Currently, only `function` is supported.
    * Values: function
    */
    enum class Type(val value: kotlin.String){
        function("function");
    }
}
