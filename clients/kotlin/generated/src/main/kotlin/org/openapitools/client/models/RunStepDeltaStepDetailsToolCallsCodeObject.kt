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

import org.openapitools.client.models.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 *
 * @param index The index of the tool call in the tool calls array.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param id The ID of the tool call.
 * @param codeInterpreter 
 */


data class RunStepDeltaStepDetailsToolCallsCodeObject (

    /* The index of the tool call in the tool calls array. */
    @Json(name = "index")
    val index: kotlin.Int,

    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    @Json(name = "type")
    val type: RunStepDeltaStepDetailsToolCallsCodeObject.Type,

    /* The ID of the tool call. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "code_interpreter")
    val codeInterpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter? = null

) {

    /**
     * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
     *
     * Values: code_interpreter
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "code_interpreter") code_interpreter("code_interpreter");
    }

}

