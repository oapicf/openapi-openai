package org.openapitools.server.api.model

import org.openapitools.server.api.model.Project
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectListResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<Project>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
