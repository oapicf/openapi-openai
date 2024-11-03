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

import org.openapitools.client.models.MessageDeltaContentTextAnnotationsFilePathObjectFilePath

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 *
 * @param index The index of the annotation in the text content part.
 * @param type Always `file_path`.
 * @param text The text in the message content that needs to be replaced.
 * @param filePath 
 * @param startIndex 
 * @param endIndex 
 */


data class MessageDeltaContentTextAnnotationsFilePathObject (

    /* The index of the annotation in the text content part. */
    @Json(name = "index")
    val index: kotlin.Int,

    /* Always `file_path`. */
    @Json(name = "type")
    val type: MessageDeltaContentTextAnnotationsFilePathObject.Type,

    /* The text in the message content that needs to be replaced. */
    @Json(name = "text")
    val text: kotlin.String? = null,

    @Json(name = "file_path")
    val filePath: MessageDeltaContentTextAnnotationsFilePathObjectFilePath? = null,

    @Json(name = "start_index")
    val startIndex: kotlin.Int? = null,

    @Json(name = "end_index")
    val endIndex: kotlin.Int? = null

) {

    /**
     * Always `file_path`.
     *
     * Values: file_path
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "file_path") file_path("file_path");
    }

}

