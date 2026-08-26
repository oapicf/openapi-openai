package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InviteProjectsInner(
    /** Project&#39;s public ID */
    val id: kotlin.String? = null,
    /** Project membership role */
    val role: kotlin.String? = null
)
