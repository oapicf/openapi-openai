package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLog
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListAuditLogsResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<AuditLog>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
