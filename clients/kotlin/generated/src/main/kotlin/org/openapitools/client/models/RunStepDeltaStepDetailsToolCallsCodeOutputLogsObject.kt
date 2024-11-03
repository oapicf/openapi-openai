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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 *
 * @param index The index of the output in the outputs array.
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 */


data class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject (

    /* The index of the output in the outputs array. */
    @Json(name = "index")
    val index: kotlin.Int,

    /* Always `logs`. */
    @Json(name = "type")
    val type: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.Type,

    /* The text output from the Code Interpreter tool call. */
    @Json(name = "logs")
    val logs: kotlin.String? = null

) {

    /**
     * Always `logs`.
     *
     * Values: logs
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "logs") logs("logs");
    }

}

