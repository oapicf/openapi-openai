package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageDeltaContentImageUrlObjectImageUrl
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaContentImageUrlObject(
    /** The index of the content part in the message. */
    val index: kotlin.Int,
    /** Always &#x60;image_url&#x60;. */
    val type: kotlin.String,
    val imageUrl: MessageDeltaContentImageUrlObjectImageUrl? = null
)
