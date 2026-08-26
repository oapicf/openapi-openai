package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListMessagesResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<MessageObject>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
