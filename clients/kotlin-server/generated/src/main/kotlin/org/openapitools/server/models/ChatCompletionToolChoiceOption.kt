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

import org.openapitools.server.models.ChatCompletionNamedToolChoice
import org.openapitools.server.models.ChatCompletionNamedToolChoiceFunction

/**
 * Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
 * @param type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
data class ChatCompletionToolChoiceOption(
    /* The type of the tool. Currently, only `function` is supported. */
    val type: ChatCompletionToolChoiceOption.Type,
    val function: ChatCompletionNamedToolChoiceFunction
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

