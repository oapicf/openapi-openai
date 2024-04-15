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

import org.openapitools.server.models.AssistantToolsCode
import org.openapitools.server.models.AssistantToolsFunction
import org.openapitools.server.models.AssistantToolsRetrieval
import org.openapitools.server.models.FunctionObject

/**
 * 
 * @param type The type of tool being defined: `code_interpreter`
 * @param function 
 */
data class AssistantObjectToolsInner(
    /* The type of tool being defined: `code_interpreter` */
    val type: AssistantObjectToolsInner.Type,
    val function: FunctionObject
) 
{
    /**
    * The type of tool being defined: `code_interpreter`
    * Values: code_interpreter,retrieval,function
    */
    enum class Type(val value: kotlin.String){
        code_interpreter("code_interpreter"),
        retrieval("retrieval"),
        function("function");
    }
}
