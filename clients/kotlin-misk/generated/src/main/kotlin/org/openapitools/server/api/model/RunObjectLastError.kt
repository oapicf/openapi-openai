package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunObjectLastError(
    /** One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;. */
    val code: kotlin.String,
    /** A human-readable description of the error. */
    val message: kotlin.String
)
