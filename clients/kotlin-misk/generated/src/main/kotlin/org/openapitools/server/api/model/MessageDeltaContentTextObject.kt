package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageDeltaContentTextObjectText
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaContentTextObject(
    /** The index of the content part in the message. */
    val index: kotlin.Int,
    /** Always &#x60;text&#x60;. */
    val type: kotlin.String,
    val text: MessageDeltaContentTextObjectText? = null
)
