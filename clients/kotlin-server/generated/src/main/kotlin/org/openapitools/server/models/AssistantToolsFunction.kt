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

import org.openapitools.server.models.FunctionObject

/**
 * 
 * @param type The type of tool being defined: `function`
 * @param function 
 */
data class AssistantToolsFunction(
    /* The type of tool being defined: `function` */
    val type: AssistantToolsFunction.Type,
    val function: FunctionObject
) 
{
    /**
    * The type of tool being defined: `function`
    * Values: function
    */
    enum class Type(val value: kotlin.String){
        function("function");
    }
}

