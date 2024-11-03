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
 * Usage statistics for the completion request.
 *
 * @param completionTokens Number of tokens in the generated completion.
 * @param promptTokens Number of tokens in the prompt.
 * @param totalTokens Total number of tokens used in the request (prompt + completion).
 */


data class CompletionUsage (

    /* Number of tokens in the generated completion. */
    @Json(name = "completion_tokens")
    val completionTokens: kotlin.Int,

    /* Number of tokens in the prompt. */
    @Json(name = "prompt_tokens")
    val promptTokens: kotlin.Int,

    /* Total number of tokens used in the request (prompt + completion). */
    @Json(name = "total_tokens")
    val totalTokens: kotlin.Int

) {


}

