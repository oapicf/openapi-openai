package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeleteVectorStoreFileResponse(
    val id: kotlin.String,
    val deleted: kotlin.Boolean,
    val `object`: kotlin.String
)
