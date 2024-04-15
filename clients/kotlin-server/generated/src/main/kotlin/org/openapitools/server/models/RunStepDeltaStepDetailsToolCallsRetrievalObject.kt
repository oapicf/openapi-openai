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
 * @param index The index of the tool call in the tool calls array.
 * @param type The type of tool call. This is always going to be `retrieval` for this type of tool call.
 * @param id The ID of the tool call object.
 * @param retrieval For now, this is always going to be an empty object.
 */
data class RunStepDeltaStepDetailsToolCallsRetrievalObject(
    /* The index of the tool call in the tool calls array. */
    val index: kotlin.Int,
    /* The type of tool call. This is always going to be `retrieval` for this type of tool call. */
    val type: RunStepDeltaStepDetailsToolCallsRetrievalObject.Type,
    /* The ID of the tool call object. */
    val id: kotlin.String? = null,
    /* For now, this is always going to be an empty object. */
    val retrieval: kotlin.Any? = null
) 
{
    /**
    * The type of tool call. This is always going to be `retrieval` for this type of tool call.
    * Values: retrieval
    */
    enum class Type(val value: kotlin.String){
        retrieval("retrieval");
    }
}
