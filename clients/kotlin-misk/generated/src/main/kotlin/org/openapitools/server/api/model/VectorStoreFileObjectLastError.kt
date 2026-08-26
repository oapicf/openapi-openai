package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VectorStoreFileObjectLastError(
    /** One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. */
    val code: kotlin.String,
    /** A human-readable description of the error. */
    val message: kotlin.String
)
