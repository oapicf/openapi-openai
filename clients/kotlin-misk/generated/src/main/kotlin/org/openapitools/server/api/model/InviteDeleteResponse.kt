package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InviteDeleteResponse(
    /** The object type, which is always &#x60;organization.invite.deleted&#x60; */
    val `object`: kotlin.String,
    val id: kotlin.String,
    val deleted: kotlin.Boolean
)
