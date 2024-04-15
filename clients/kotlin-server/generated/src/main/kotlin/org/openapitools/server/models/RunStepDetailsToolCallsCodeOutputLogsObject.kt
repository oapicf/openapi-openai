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
 * Text output from the Code Interpreter tool call as part of a run step.
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 */
data class RunStepDetailsToolCallsCodeOutputLogsObject(
    /* Always `logs`. */
    val type: RunStepDetailsToolCallsCodeOutputLogsObject.Type,
    /* The text output from the Code Interpreter tool call. */
    val logs: kotlin.String
) 
{
    /**
    * Always `logs`.
    * Values: logs
    */
    enum class Type(val value: kotlin.String){
        logs("logs");
    }
}
