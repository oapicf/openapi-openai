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

import org.openapitools.client.models.RunStepDetailsToolCallsCodeOutputImageObject
import org.openapitools.client.models.RunStepDetailsToolCallsCodeOutputImageObjectImage
import org.openapitools.client.models.RunStepDetailsToolCallsCodeOutputLogsObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 * @param image 
 */


data class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (

    /* Always `logs`. */
    @Json(name = "type")
    val type: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.Type,

    /* The text output from the Code Interpreter tool call. */
    @Json(name = "logs")
    val logs: kotlin.String,

    @Json(name = "image")
    val image: RunStepDetailsToolCallsCodeOutputImageObjectImage

) {

    /**
     * Always `logs`.
     *
     * Values: logs,image
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "logs") logs("logs"),
        @Json(name = "image") image("image");
    }

}

