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
 * 
 *
 * @param role The role of the messages author, in this case `tool`.
 * @param content The contents of the tool message.
 * @param toolCallId Tool call that this message is responding to.
 */


data class ChatCompletionRequestToolMessage (

    /* The role of the messages author, in this case `tool`. */
    @Json(name = "role")
    val role: ChatCompletionRequestToolMessage.Role,

    /* The contents of the tool message. */
    @Json(name = "content")
    val content: kotlin.String,

    /* Tool call that this message is responding to. */
    @Json(name = "tool_call_id")
    val toolCallId: kotlin.String

) {

    /**
     * The role of the messages author, in this case `tool`.
     *
     * Values: tool
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "tool") tool("tool");
    }
}

