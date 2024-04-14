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

import org.openapitools.client.models.RunToolCallObjectFunction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Tool call objects
 *
 * @param id The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
 * @param type The type of tool call the output is required for. For now, this is always `function`.
 * @param function 
 */


data class RunToolCallObject (

    /* The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The type of tool call the output is required for. For now, this is always `function`. */
    @Json(name = "type")
    val type: RunToolCallObject.Type,

    @Json(name = "function")
    val function: RunToolCallObjectFunction

) {

    /**
     * The type of tool call the output is required for. For now, this is always `function`.
     *
     * Values: function
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "function") function("function");
    }
}

