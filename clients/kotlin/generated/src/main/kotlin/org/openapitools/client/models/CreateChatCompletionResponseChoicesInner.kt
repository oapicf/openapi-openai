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

import org.openapitools.client.models.ChatCompletionResponseMessage
import org.openapitools.client.models.CreateChatCompletionResponseChoicesInnerLogprobs

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
 * @param index The index of the choice in the list of choices.
 * @param message 
 * @param logprobs 
 */


data class CreateChatCompletionResponseChoicesInner (

    /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  */
    @Json(name = "finish_reason")
    val finishReason: CreateChatCompletionResponseChoicesInner.FinishReason,

    /* The index of the choice in the list of choices. */
    @Json(name = "index")
    val index: kotlin.Int,

    @Json(name = "message")
    val message: ChatCompletionResponseMessage,

    @Json(name = "logprobs")
    val logprobs: CreateChatCompletionResponseChoicesInnerLogprobs?

) {

    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
     *
     * Values: stop,length,tool_calls,content_filter,function_call
     */
    @JsonClass(generateAdapter = false)
    enum class FinishReason(val value: kotlin.String) {
        @Json(name = "stop") stop("stop"),
        @Json(name = "length") length("length"),
        @Json(name = "tool_calls") tool_calls("tool_calls"),
        @Json(name = "content_filter") content_filter("content_filter"),
        @Json(name = "function_call") function_call("function_call");
    }

}

