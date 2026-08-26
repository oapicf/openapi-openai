package org.openapitools.server.api.model

import org.openapitools.server.api.model.OpenAIFile
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListFilesResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<OpenAIFile>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
