package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VectorStoreExpirationAfter(
    /** Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. */
    val anchor: kotlin.String,
    /** The number of days after the anchor time that the vector store will expire. */
    val days: kotlin.Int
)
