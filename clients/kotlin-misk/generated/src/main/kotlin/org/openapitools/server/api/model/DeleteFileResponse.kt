package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeleteFileResponse(
    val id: kotlin.String,
    val `object`: kotlin.String,
    val deleted: kotlin.Boolean
)
