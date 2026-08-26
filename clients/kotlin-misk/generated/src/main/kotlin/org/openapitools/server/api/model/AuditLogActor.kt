package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogActorApiKey
import org.openapitools.server.api.model.AuditLogActorSession
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogActor(
    /** The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;. */
    val type: kotlin.String? = null,
    val session: AuditLogActorSession? = null,
    val apiKey: AuditLogActorApiKey? = null
)
