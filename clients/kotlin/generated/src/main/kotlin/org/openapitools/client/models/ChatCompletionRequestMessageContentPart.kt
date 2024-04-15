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

import org.openapitools.client.models.ChatCompletionRequestMessageContentPartImage
import org.openapitools.client.models.ChatCompletionRequestMessageContentPartImageImageUrl
import org.openapitools.client.models.ChatCompletionRequestMessageContentPartText

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type The type of the content part.
 * @param text The text content.
 * @param imageUrl 
 */


data class ChatCompletionRequestMessageContentPart (

    /* The type of the content part. */
    @Json(name = "type")
    val type: ChatCompletionRequestMessageContentPart.Type,

    /* The text content. */
    @Json(name = "text")
    val text: kotlin.String,

    @Json(name = "image_url")
    val imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl

) {

    /**
     * The type of the content part.
     *
     * Values: text,image_url
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "text") text("text"),
        @Json(name = "image_url") image_url("image_url");
    }
}
