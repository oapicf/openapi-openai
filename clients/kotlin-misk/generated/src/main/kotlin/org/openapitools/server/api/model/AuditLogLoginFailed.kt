package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogLoginFailed(
    /** The error code of the failure. */
    val errorCode: kotlin.String? = null,
    /** The error message of the failure. */
    val errorMessage: kotlin.String? = null
)
