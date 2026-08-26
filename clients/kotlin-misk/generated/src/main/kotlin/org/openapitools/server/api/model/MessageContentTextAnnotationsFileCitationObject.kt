package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageContentTextAnnotationsFileCitationObjectFileCitation
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageContentTextAnnotationsFileCitationObject(
    /** Always &#x60;file_citation&#x60;. */
    val type: kotlin.String,
    /** The text in the message content that needs to be replaced. */
    val text: kotlin.String,
    val fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
    val startIndex: kotlin.Int,
    val endIndex: kotlin.Int
)
