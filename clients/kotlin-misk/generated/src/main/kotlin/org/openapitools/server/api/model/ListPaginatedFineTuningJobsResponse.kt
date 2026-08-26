package org.openapitools.server.api.model

import org.openapitools.server.api.model.FineTuningJob
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListPaginatedFineTuningJobsResponse(
    val `data`: kotlin.collections.List<FineTuningJob>,
    val hasMore: kotlin.Boolean,
    val `object`: kotlin.String
)
