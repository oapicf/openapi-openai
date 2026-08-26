package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListAssistantsResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<AssistantObject>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
