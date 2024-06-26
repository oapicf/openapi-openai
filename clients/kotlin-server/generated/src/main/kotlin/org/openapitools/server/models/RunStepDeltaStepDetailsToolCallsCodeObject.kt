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

import org.openapitools.server.models.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 * @param index The index of the tool call in the tool calls array.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param id The ID of the tool call.
 * @param codeInterpreter 
 */
data class RunStepDeltaStepDetailsToolCallsCodeObject(
    /* The index of the tool call in the tool calls array. */
    val index: kotlin.Int,
    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    val type: RunStepDeltaStepDetailsToolCallsCodeObject.Type,
    /* The ID of the tool call. */
    val id: kotlin.String? = null,
    val codeInterpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter? = null
) 
{
    /**
    * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    * Values: code_interpreter
    */
    enum class Type(val value: kotlin.String){
        code_interpreter("code_interpreter");
    }
}

