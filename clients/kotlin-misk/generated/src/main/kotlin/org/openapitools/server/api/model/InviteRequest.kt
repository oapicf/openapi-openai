package org.openapitools.server.api.model

import org.openapitools.server.api.model.InviteRequestProjectsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InviteRequest(
    /** Send an email to this address */
    val email: kotlin.String,
    /** &#x60;owner&#x60; or &#x60;reader&#x60; */
    val role: kotlin.String,
    /** An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. */
    val projects: kotlin.collections.List<InviteRequestProjectsInner>? = null
)
