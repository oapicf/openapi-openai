package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProjectUser
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectUserListResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<ProjectUser>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
