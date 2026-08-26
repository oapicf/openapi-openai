package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Error(
    val code: kotlin.String,
    val message: kotlin.String,
    val `param`: kotlin.String,
    val type: kotlin.String
)
