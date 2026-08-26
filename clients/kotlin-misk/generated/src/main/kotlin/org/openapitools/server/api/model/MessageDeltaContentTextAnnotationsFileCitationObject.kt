package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaContentTextAnnotationsFileCitationObject(
    /** The index of the annotation in the text content part. */
    val index: kotlin.Int,
    /** Always &#x60;file_citation&#x60;. */
    val type: kotlin.String,
    /** The text in the message content that needs to be replaced. */
    val text: kotlin.String? = null,
    val fileCitation: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation? = null,
    val startIndex: kotlin.Int? = null,
    val endIndex: kotlin.Int? = null
)
