package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BatchRequestOutputError(
    /** A machine-readable error code. */
    val code: kotlin.String? = null,
    /** A human-readable error message. */
    val message: kotlin.String? = null
)
