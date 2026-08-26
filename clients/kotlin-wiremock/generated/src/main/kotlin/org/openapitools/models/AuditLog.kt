@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLog(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("type")
    val type: AuditLogEventType,

    @field:JsonProperty("effective_at")
    val effectiveAt: kotlin.Int,

    @field:JsonProperty("actor")
    val actor: AuditLogActor,

    @field:JsonProperty("project")
    val project: AuditLogProject? = null,

    @field:JsonProperty("api_key.created")
    val apiKeyCreated: AuditLogApiKeyCreated? = null,

    @field:JsonProperty("api_key.updated")
    val apiKeyUpdated: AuditLogApiKeyUpdated? = null,

    @field:JsonProperty("api_key.deleted")
    val apiKeyDeleted: AuditLogApiKeyDeleted? = null,

    @field:JsonProperty("invite.sent")
    val inviteSent: AuditLogInviteSent? = null,

    @field:JsonProperty("invite.accepted")
    val inviteAccepted: AuditLogInviteAccepted? = null,

    @field:JsonProperty("invite.deleted")
    val inviteDeleted: AuditLogInviteAccepted? = null,

    @field:JsonProperty("login.failed")
    val loginFailed: AuditLogLoginFailed? = null,

    @field:JsonProperty("logout.failed")
    val logoutFailed: AuditLogLoginFailed? = null,

    @field:JsonProperty("organization.updated")
    val organizationUpdated: AuditLogOrganizationUpdated? = null,

    @field:JsonProperty("project.created")
    val projectCreated: AuditLogProjectCreated? = null,

    @field:JsonProperty("project.updated")
    val projectUpdated: AuditLogProjectUpdated? = null,

    @field:JsonProperty("project.archived")
    val projectArchived: AuditLogProjectArchived? = null,

    @field:JsonProperty("rate_limit.updated")
    val rateLimitUpdated: AuditLogRateLimitUpdated? = null,

    @field:JsonProperty("rate_limit.deleted")
    val rateLimitDeleted: AuditLogRateLimitDeleted? = null,

    @field:JsonProperty("service_account.created")
    val serviceAccountCreated: AuditLogServiceAccountCreated? = null,

    @field:JsonProperty("service_account.updated")
    val serviceAccountUpdated: AuditLogServiceAccountUpdated? = null,

    @field:JsonProperty("service_account.deleted")
    val serviceAccountDeleted: AuditLogServiceAccountDeleted? = null,

    @field:JsonProperty("user.added")
    val userAdded: AuditLogUserAdded? = null,

    @field:JsonProperty("user.updated")
    val userUpdated: AuditLogUserUpdated? = null,

    @field:JsonProperty("user.deleted")
    val userDeleted: AuditLogUserDeleted? = null,

)
