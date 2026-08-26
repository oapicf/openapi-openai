package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogActorServiceAccount(
    /** The service account id. */
    val id: kotlin.String? = null
)
