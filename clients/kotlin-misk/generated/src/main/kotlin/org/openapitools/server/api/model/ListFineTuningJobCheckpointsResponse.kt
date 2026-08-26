package org.openapitools.server.api.model

import org.openapitools.server.api.model.FineTuningJobCheckpoint
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListFineTuningJobCheckpointsResponse(
    val `data`: kotlin.collections.List<FineTuningJobCheckpoint>,
    val `object`: kotlin.String,
    val hasMore: kotlin.Boolean,
    val firstId: kotlin.String? = null,
    val lastId: kotlin.String? = null
)
