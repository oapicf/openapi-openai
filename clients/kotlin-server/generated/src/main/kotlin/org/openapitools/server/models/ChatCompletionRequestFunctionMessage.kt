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
 * @param role The role of the messages author, in this case `function`.
 * @param content The contents of the function message.
 * @param name The name of the function to call.
 */
data class ChatCompletionRequestFunctionMessage(
    /* The role of the messages author, in this case `function`. */
    val role: ChatCompletionRequestFunctionMessage.Role,
    /* The contents of the function message. */
    val content: kotlin.String,
    /* The name of the function to call. */
    val name: kotlin.String
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
