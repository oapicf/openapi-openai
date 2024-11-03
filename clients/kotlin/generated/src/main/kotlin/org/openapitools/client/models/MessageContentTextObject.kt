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

import org.openapitools.client.models.MessageContentTextObjectText

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The text content that is part of a message.
 *
 * @param type Always `text`.
 * @param text 
 */


data class MessageContentTextObject (

    /* Always `text`. */
    @Json(name = "type")
    val type: MessageContentTextObject.Type,

    @Json(name = "text")
    val text: MessageContentTextObjectText

) {

    /**
     * Always `text`.
     *
     * Values: text
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "text") text("text");
    }

}

