package org.openapitools.server.api.model

import org.openapitools.server.api.model.Model
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListModelsResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<Model>
)
