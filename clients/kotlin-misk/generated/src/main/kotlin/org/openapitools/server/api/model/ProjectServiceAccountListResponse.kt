package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProjectServiceAccount
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectServiceAccountListResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<ProjectServiceAccount>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
