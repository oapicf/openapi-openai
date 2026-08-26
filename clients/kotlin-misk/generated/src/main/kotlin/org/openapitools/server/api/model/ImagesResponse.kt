package org.openapitools.server.api.model

import org.openapitools.server.api.model.Image
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImagesResponse(
    val created: kotlin.Int,
    val `data`: kotlin.collections.List<Image>
)
