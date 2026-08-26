package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogUserUpdatedChangesRequested(
    /** The role of the user. Is either &#x60;owner&#x60; or &#x60;member&#x60;. */
    val role: kotlin.String? = null
)
