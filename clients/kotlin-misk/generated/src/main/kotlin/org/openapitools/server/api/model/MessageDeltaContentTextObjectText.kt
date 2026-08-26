package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageDeltaContentTextObjectTextAnnotationsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaContentTextObjectText(
    /** The data that makes up the text. */
    val `value`: kotlin.String? = null,
    val annotations: kotlin.collections.List<MessageDeltaContentTextObjectTextAnnotationsInner>? = null
)
