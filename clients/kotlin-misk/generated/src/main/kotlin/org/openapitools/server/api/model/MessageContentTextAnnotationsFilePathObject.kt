package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageContentTextAnnotationsFilePathObjectFilePath
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageContentTextAnnotationsFilePathObject(
    /** Always &#x60;file_path&#x60;. */
    val type: kotlin.String,
    /** The text in the message content that needs to be replaced. */
    val text: kotlin.String,
    val filePath: MessageContentTextAnnotationsFilePathObjectFilePath,
    val startIndex: kotlin.Int,
    val endIndex: kotlin.Int
)
