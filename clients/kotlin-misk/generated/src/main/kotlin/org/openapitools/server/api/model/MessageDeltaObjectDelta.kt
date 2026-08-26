package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageDeltaObjectDeltaContentInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaObjectDelta(
    /** The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. */
    val role: kotlin.String? = null,
    /** The content of the message in array of text and/or images. */
    val content: kotlin.collections.List<MessageDeltaObjectDeltaContentInner>? = null
)
