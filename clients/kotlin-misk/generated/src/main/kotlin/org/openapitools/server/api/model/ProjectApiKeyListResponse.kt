package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProjectApiKey
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectApiKeyListResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<ProjectApiKey>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
