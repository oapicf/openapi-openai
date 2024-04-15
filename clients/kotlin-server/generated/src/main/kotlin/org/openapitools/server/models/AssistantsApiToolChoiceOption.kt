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

import org.openapitools.server.models.AssistantsApiNamedToolChoice
import org.openapitools.server.models.ChatCompletionNamedToolChoiceFunction

/**
 * Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
 * @param type The type of the tool. If type is `function`, the function name must be set
 * @param function 
 */
data class AssistantsApiToolChoiceOption(
    /* The type of the tool. If type is `function`, the function name must be set */
    val type: AssistantsApiToolChoiceOption.Type,
    val function: ChatCompletionNamedToolChoiceFunction? = null
) 
{
    /**
    * The type of the tool. If type is `function`, the function name must be set
    * Values: function,code_interpreter,retrieval
    */
    enum class Type(val value: kotlin.String){
        function("function"),
        code_interpreter("code_interpreter"),
        retrieval("retrieval");
    }
}
