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

import org.openapitools.client.models.ChatCompletionMessageToolCall
import org.openapitools.client.models.ChatCompletionRequestAssistantMessageFunctionCall

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param role The role of the messages author, in this case `assistant`.
 * @param content The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 * @param toolCalls The tool calls generated by the model, such as function calls.
 * @param functionCall 
 */


data class ChatCompletionRequestAssistantMessage (

    /* The role of the messages author, in this case `assistant`. */
    @Json(name = "role")
    val role: ChatCompletionRequestAssistantMessage.Role,

    /* The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified.  */
    @Json(name = "content")
    val content: kotlin.String? = null,

    /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The tool calls generated by the model, such as function calls. */
    @Json(name = "tool_calls")
    val toolCalls: kotlin.collections.List<ChatCompletionMessageToolCall>? = null,

    @Json(name = "function_call")
    @Deprecated(message = "This property is deprecated.")
    val functionCall: ChatCompletionRequestAssistantMessageFunctionCall? = null

) {

    /**
     * The role of the messages author, in this case `assistant`.
     *
     * Values: assistant
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "assistant") assistant("assistant");
    }

}

