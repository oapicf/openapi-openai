package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeResponseStatusDetailsError(
    /** The type of error. */
    val type: kotlin.String? = null,
    /** Error code, if any. */
    val code: kotlin.String? = null
)
