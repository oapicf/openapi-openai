package org.openapitools.server.api.model

import org.openapitools.server.api.model.Error
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ErrorResponse(
    val error: Error
)
