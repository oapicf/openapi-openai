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

import org.openapitools.client.models.ChatCompletionMessageToolCallFunction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id The ID of the tool call.
 * @param type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */


data class ChatCompletionMessageToolCall (

    /* The ID of the tool call. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The type of the tool. Currently, only `function` is supported. */
    @Json(name = "type")
    val type: ChatCompletionMessageToolCall.Type,

    @Json(name = "function")
    val function: ChatCompletionMessageToolCallFunction

) {

    /**
     * The type of the tool. Currently, only `function` is supported.
     *
     * Values: function
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "function") function("function");
    }
}
