package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DoneEvent(
    val event: kotlin.String,
    val `data`: kotlin.String
)
