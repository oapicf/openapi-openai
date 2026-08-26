package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageContentTextObjectText
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageContentTextObject(
    /** Always &#x60;text&#x60;. */
    val type: kotlin.String,
    val text: MessageContentTextObjectText
)
