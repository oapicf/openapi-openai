package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogActor
import org.openapitools.server.api.model.AuditLogApiKeyCreated
import org.openapitools.server.api.model.AuditLogApiKeyDeleted
import org.openapitools.server.api.model.AuditLogApiKeyUpdated
import org.openapitools.server.api.model.AuditLogEventType
import org.openapitools.server.api.model.AuditLogInviteAccepted
import org.openapitools.server.api.model.AuditLogInviteSent
import org.openapitools.server.api.model.AuditLogLoginFailed
import org.openapitools.server.api.model.AuditLogOrganizationUpdated
import org.openapitools.server.api.model.AuditLogProject
import org.openapitools.server.api.model.AuditLogProjectArchived
import org.openapitools.server.api.model.AuditLogProjectCreated
import org.openapitools.server.api.model.AuditLogProjectUpdated
import org.openapitools.server.api.model.AuditLogRateLimitDeleted
import org.openapitools.server.api.model.AuditLogRateLimitUpdated
import org.openapitools.server.api.model.AuditLogServiceAccountCreated
import org.openapitools.server.api.model.AuditLogServiceAccountDeleted
import org.openapitools.server.api.model.AuditLogServiceAccountUpdated
import org.openapitools.server.api.model.AuditLogUserAdded
import org.openapitools.server.api.model.AuditLogUserDeleted
import org.openapitools.server.api.model.AuditLogUserUpdated
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLog(
    /** The ID of this log. */
    val id: kotlin.String,
    val type: AuditLogEventType,
    /** The Unix timestamp (in seconds) of the event. */
    val effectiveAt: kotlin.Int,
    val actor: AuditLogActor,
    val project: AuditLogProject? = null,
    val apiKeyCreated: AuditLogApiKeyCreated? = null,
    val apiKeyUpdated: AuditLogApiKeyUpdated? = null,
    val apiKeyDeleted: AuditLogApiKeyDeleted? = null,
    val inviteSent: AuditLogInviteSent? = null,
    val inviteAccepted: AuditLogInviteAccepted? = null,
    val inviteDeleted: AuditLogInviteAccepted? = null,
    val loginFailed: AuditLogLoginFailed? = null,
    val logoutFailed: AuditLogLoginFailed? = null,
    val organizationUpdated: AuditLogOrganizationUpdated? = null,
    val projectCreated: AuditLogProjectCreated? = null,
    val projectUpdated: AuditLogProjectUpdated? = null,
    val projectArchived: AuditLogProjectArchived? = null,
    val rateLimitUpdated: AuditLogRateLimitUpdated? = null,
    val rateLimitDeleted: AuditLogRateLimitDeleted? = null,
    val serviceAccountCreated: AuditLogServiceAccountCreated? = null,
    val serviceAccountUpdated: AuditLogServiceAccountUpdated? = null,
    val serviceAccountDeleted: AuditLogServiceAccountDeleted? = null,
    val userAdded: AuditLogUserAdded? = null,
    val userUpdated: AuditLogUserUpdated? = null,
    val userDeleted: AuditLogUserDeleted? = null
)
