package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserDeleteResponse(
    val `object`: kotlin.String,
    val id: kotlin.String,
    val deleted: kotlin.Boolean
)
