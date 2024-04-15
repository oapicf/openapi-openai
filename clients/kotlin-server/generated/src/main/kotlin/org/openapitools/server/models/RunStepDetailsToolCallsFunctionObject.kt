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

import org.openapitools.server.models.RunStepDetailsToolCallsFunctionObjectFunction

/**
 * 
 * @param id The ID of the tool call object.
 * @param type The type of tool call. This is always going to be `function` for this type of tool call.
 * @param function 
 */
data class RunStepDetailsToolCallsFunctionObject(
    /* The ID of the tool call object. */
    val id: kotlin.String,
    /* The type of tool call. This is always going to be `function` for this type of tool call. */
    val type: RunStepDetailsToolCallsFunctionObject.Type,
    val function: RunStepDetailsToolCallsFunctionObjectFunction
) 
{
    /**
    * The type of tool call. This is always going to be `function` for this type of tool call.
    * Values: function
    */
    enum class Type(val value: kotlin.String){
        function("function");
    }
}
