package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogActorServiceAccount
import org.openapitools.server.api.model.AuditLogActorUser
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogActorApiKey(
    /** The tracking id of the API key. */
    val id: kotlin.String? = null,
    /** The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;. */
    val type: kotlin.String? = null,
    val user: AuditLogActorUser? = null,
    val serviceAccount: AuditLogActorServiceAccount? = null
)
