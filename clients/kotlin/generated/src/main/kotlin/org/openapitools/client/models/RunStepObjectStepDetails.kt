/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.RunStepDetailsMessageCreationObject
import org.openapitools.client.models.RunStepDetailsMessageCreationObjectMessageCreation
import org.openapitools.client.models.RunStepDetailsToolCallsObject
import org.openapitools.client.models.RunStepDetailsToolCallsObjectToolCallsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The details of the run step.
 *
 * @param type Always `message_creation`.
 * @param messageCreation 
 * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
 */


data class RunStepObjectStepDetails (

    /* Always `message_creation`. */
    @Json(name = "type")
    val type: RunStepObjectStepDetails.Type,

    @Json(name = "message_creation")
    val messageCreation: RunStepDetailsMessageCreationObjectMessageCreation,

    /* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.  */
    @Json(name = "tool_calls")
    val toolCalls: kotlin.collections.List<RunStepDetailsToolCallsObjectToolCallsInner>

) {

    /**
     * Always `message_creation`.
     *
     * Values: message_creation,tool_calls
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "message_creation") message_creation("message_creation"),
        @Json(name = "tool_calls") tool_calls("tool_calls");
    }

}

