package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateMessageRequestAttachmentsInnerToolsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateMessageRequestAttachmentsInner(
    /** The ID of the file to attach to the message. */
    val fileId: kotlin.String? = null,
    /** The tools to add this file to. */
    val tools: kotlin.collections.List<CreateMessageRequestAttachmentsInnerToolsInner>? = null
)
