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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param index 
 * @param message 
 * @param finishReason 
 */


data class CreateChatCompletionResponseChoicesInner (

    @Json(name = "index")
    val index: kotlin.Int? = null,

    @Json(name = "message")
    val message: ChatCompletionResponseMessage? = null,

    @Json(name = "finish_reason")
    val finishReason: CreateChatCompletionResponseChoicesInner.FinishReason? = null

) {

    /**
     * 
     *
     * Values: stop,length,function_call
     */
    @JsonClass(generateAdapter = false)
    enum class FinishReason(val value: kotlin.String) {
        @Json(name = "stop") stop("stop"),
        @Json(name = "length") length("length"),
        @Json(name = "function_call") function_call("function_call");
    }
}

