package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListRunStepsResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<RunStepObject>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
