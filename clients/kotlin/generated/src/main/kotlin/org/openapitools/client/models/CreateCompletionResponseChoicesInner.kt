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

import org.openapitools.client.models.CreateCompletionResponseChoicesInnerLogprobs

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param text 
 * @param index 
 * @param logprobs 
 * @param finishReason 
 */


data class CreateCompletionResponseChoicesInner (

    @Json(name = "text")
    val text: kotlin.String,

    @Json(name = "index")
    val index: kotlin.Int,

    @Json(name = "logprobs")
    val logprobs: CreateCompletionResponseChoicesInnerLogprobs?,

    @Json(name = "finish_reason")
    val finishReason: CreateCompletionResponseChoicesInner.FinishReason

) {

    /**
     * 
     *
     * Values: stop,length
     */
    @JsonClass(generateAdapter = false)
    enum class FinishReason(val value: kotlin.String) {
        @Json(name = "stop") stop("stop"),
        @Json(name = "length") length("length");
    }
}
