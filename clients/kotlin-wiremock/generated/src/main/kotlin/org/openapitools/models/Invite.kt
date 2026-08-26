@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Invite(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("email")
    val email: kotlin.String,

    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("status")
    val status: kotlin.String,

    @field:JsonProperty("invited_at")
    val invitedAt: kotlin.Int,

    @field:JsonProperty("expires_at")
    val expiresAt: kotlin.Int,

    @field:JsonProperty("accepted_at")
    val acceptedAt: kotlin.Int? = null,

    @field:JsonProperty("projects")
    val projects: kotlin.collections.List<InviteProjectsInner>? = null,

)
