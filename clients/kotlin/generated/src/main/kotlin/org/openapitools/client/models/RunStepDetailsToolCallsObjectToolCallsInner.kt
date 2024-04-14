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

import org.openapitools.client.models.RunStepDetailsToolCallsCodeObject
import org.openapitools.client.models.RunStepDetailsToolCallsCodeObjectCodeInterpreter
import org.openapitools.client.models.RunStepDetailsToolCallsFunctionObject
import org.openapitools.client.models.RunStepDetailsToolCallsFunctionObjectFunction
import org.openapitools.client.models.RunStepDetailsToolCallsRetrievalObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id The ID of the tool call object.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param codeInterpreter 
 * @param retrieval For now, this is always going to be an empty object.
 * @param function 
 */


data class RunStepDetailsToolCallsObjectToolCallsInner (

    /* The ID of the tool call object. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    @Json(name = "type")
    val type: RunStepDetailsToolCallsObjectToolCallsInner.Type,

    @Json(name = "code_interpreter")
    val codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter,

    /* For now, this is always going to be an empty object. */
    @Json(name = "retrieval")
    val retrieval: kotlin.Any,

    @Json(name = "function")
    val function: RunStepDetailsToolCallsFunctionObjectFunction

) {

    /**
     * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
     *
     * Values: code_interpreter,retrieval,function
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "code_interpreter") code_interpreter("code_interpreter"),
        @Json(name = "retrieval") retrieval("retrieval"),
        @Json(name = "function") function("function");
    }
}

