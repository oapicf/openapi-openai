package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageContentImageUrlObjectImageUrl
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageContentImageUrlObject(
    /** The type of the content part. */
    val type: kotlin.String,
    val imageUrl: MessageContentImageUrlObjectImageUrl
)
