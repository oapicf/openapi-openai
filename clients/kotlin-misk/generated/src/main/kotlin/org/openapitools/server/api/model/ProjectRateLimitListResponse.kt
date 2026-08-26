package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProjectRateLimit
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectRateLimitListResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<ProjectRateLimit>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
