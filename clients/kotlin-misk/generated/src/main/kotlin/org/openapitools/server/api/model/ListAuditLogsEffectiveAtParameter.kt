package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListAuditLogsEffectiveAtParameter(
    /** Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than this value. */
    val gt: kotlin.Int? = null,
    /** Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than or equal to this value. */
    val gte: kotlin.Int? = null,
    /** Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than this value. */
    val lt: kotlin.Int? = null,
    /** Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than or equal to this value. */
    val lte: kotlin.Int? = null
)
