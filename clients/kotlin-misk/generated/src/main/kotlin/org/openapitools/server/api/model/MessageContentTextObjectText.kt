package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageContentTextObjectTextAnnotationsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageContentTextObjectText(
    /** The data that makes up the text. */
    val `value`: kotlin.String,
    val annotations: kotlin.collections.List<MessageContentTextObjectTextAnnotationsInner>
)
