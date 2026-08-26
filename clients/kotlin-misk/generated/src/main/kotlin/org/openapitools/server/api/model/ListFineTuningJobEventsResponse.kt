package org.openapitools.server.api.model

import org.openapitools.server.api.model.FineTuningJobEvent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListFineTuningJobEventsResponse(
    val `data`: kotlin.collections.List<FineTuningJobEvent>,
    val `object`: kotlin.String
)
