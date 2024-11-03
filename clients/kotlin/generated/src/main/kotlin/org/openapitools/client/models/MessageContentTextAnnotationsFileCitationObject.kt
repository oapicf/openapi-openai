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

import org.openapitools.client.models.MessageContentTextAnnotationsFileCitationObjectFileCitation

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
 *
 * @param type Always `file_citation`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileCitation 
 * @param startIndex 
 * @param endIndex 
 */


data class MessageContentTextAnnotationsFileCitationObject (

    /* Always `file_citation`. */
    @Json(name = "type")
    val type: MessageContentTextAnnotationsFileCitationObject.Type,

    /* The text in the message content that needs to be replaced. */
    @Json(name = "text")
    val text: kotlin.String,

    @Json(name = "file_citation")
    val fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,

    @Json(name = "start_index")
    val startIndex: kotlin.Int,

    @Json(name = "end_index")
    val endIndex: kotlin.Int

) {

    /**
     * Always `file_citation`.
     *
     * Values: file_citation
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "file_citation") file_citation("file_citation");
    }

}

