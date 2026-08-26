package org.openapitools.server.api.model

import org.openapitools.server.api.model.InviteProjectsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Invite(
    /** The object type, which is always &#x60;organization.invite&#x60; */
    val `object`: kotlin.String,
    /** The identifier, which can be referenced in API endpoints */
    val id: kotlin.String,
    /** The email address of the individual to whom the invite was sent */
    val email: kotlin.String,
    /** &#x60;owner&#x60; or &#x60;reader&#x60; */
    val role: kotlin.String,
    /** &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; */
    val status: kotlin.String,
    /** The Unix timestamp (in seconds) of when the invite was sent. */
    val invitedAt: kotlin.Int,
    /** The Unix timestamp (in seconds) of when the invite expires. */
    val expiresAt: kotlin.Int,
    /** The Unix timestamp (in seconds) of when the invite was accepted. */
    val acceptedAt: kotlin.Int? = null,
    /** The projects that were granted membership upon acceptance of the invite. */
    val projects: kotlin.collections.List<InviteProjectsInner>? = null
)
