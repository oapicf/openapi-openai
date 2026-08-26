package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AuditLogActor
import org.openapitools.model.AuditLogApiKeyCreated
import org.openapitools.model.AuditLogApiKeyDeleted
import org.openapitools.model.AuditLogApiKeyUpdated
import org.openapitools.model.AuditLogEventType
import org.openapitools.model.AuditLogInviteAccepted
import org.openapitools.model.AuditLogInviteSent
import org.openapitools.model.AuditLogLoginFailed
import org.openapitools.model.AuditLogOrganizationUpdated
import org.openapitools.model.AuditLogProject
import org.openapitools.model.AuditLogProjectArchived
import org.openapitools.model.AuditLogProjectCreated
import org.openapitools.model.AuditLogProjectUpdated
import org.openapitools.model.AuditLogRateLimitDeleted
import org.openapitools.model.AuditLogRateLimitUpdated
import org.openapitools.model.AuditLogServiceAccountCreated
import org.openapitools.model.AuditLogServiceAccountDeleted
import org.openapitools.model.AuditLogServiceAccountUpdated
import org.openapitools.model.AuditLogUserAdded
import org.openapitools.model.AuditLogUserDeleted
import org.openapitools.model.AuditLogUserUpdated
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * A log of a user action or configuration change within this organization.
 * @param id The ID of this log.
 * @param type 
 * @param effectiveAt The Unix timestamp (in seconds) of the event.
 * @param actor 
 * @param project 
 * @param apiKeyCreated 
 * @param apiKeyUpdated 
 * @param apiKeyDeleted 
 * @param inviteSent 
 * @param inviteAccepted 
 * @param inviteDeleted 
 * @param loginFailed 
 * @param logoutFailed 
 * @param organizationUpdated 
 * @param projectCreated 
 * @param projectUpdated 
 * @param projectArchived 
 * @param rateLimitUpdated 
 * @param rateLimitDeleted 
 * @param serviceAccountCreated 
 * @param serviceAccountUpdated 
 * @param serviceAccountDeleted 
 * @param userAdded 
 * @param userUpdated 
 * @param userDeleted 
 */
data class AuditLog(

    @Schema(required = true, description = "The ID of this log.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: AuditLogEventType,

    @Schema(required = true, description = "The Unix timestamp (in seconds) of the event.")
    @param:JsonProperty("effective_at")
    @get:JsonProperty("effective_at", required = true) val effectiveAt: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("actor")
    @get:JsonProperty("actor", required = true) val actor: AuditLogActor,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("project")
    @get:JsonProperty("project") val project: AuditLogProject? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("api_key.created")
    @get:JsonProperty("api_key.created") val apiKeyCreated: AuditLogApiKeyCreated? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("api_key.updated")
    @get:JsonProperty("api_key.updated") val apiKeyUpdated: AuditLogApiKeyUpdated? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("api_key.deleted")
    @get:JsonProperty("api_key.deleted") val apiKeyDeleted: AuditLogApiKeyDeleted? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("invite.sent")
    @get:JsonProperty("invite.sent") val inviteSent: AuditLogInviteSent? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("invite.accepted")
    @get:JsonProperty("invite.accepted") val inviteAccepted: AuditLogInviteAccepted? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("invite.deleted")
    @get:JsonProperty("invite.deleted") val inviteDeleted: AuditLogInviteAccepted? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("login.failed")
    @get:JsonProperty("login.failed") val loginFailed: AuditLogLoginFailed? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("logout.failed")
    @get:JsonProperty("logout.failed") val logoutFailed: AuditLogLoginFailed? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("organization.updated")
    @get:JsonProperty("organization.updated") val organizationUpdated: AuditLogOrganizationUpdated? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("project.created")
    @get:JsonProperty("project.created") val projectCreated: AuditLogProjectCreated? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("project.updated")
    @get:JsonProperty("project.updated") val projectUpdated: AuditLogProjectUpdated? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("project.archived")
    @get:JsonProperty("project.archived") val projectArchived: AuditLogProjectArchived? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rate_limit.updated")
    @get:JsonProperty("rate_limit.updated") val rateLimitUpdated: AuditLogRateLimitUpdated? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rate_limit.deleted")
    @get:JsonProperty("rate_limit.deleted") val rateLimitDeleted: AuditLogRateLimitDeleted? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service_account.created")
    @get:JsonProperty("service_account.created") val serviceAccountCreated: AuditLogServiceAccountCreated? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service_account.updated")
    @get:JsonProperty("service_account.updated") val serviceAccountUpdated: AuditLogServiceAccountUpdated? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service_account.deleted")
    @get:JsonProperty("service_account.deleted") val serviceAccountDeleted: AuditLogServiceAccountDeleted? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.added")
    @get:JsonProperty("user.added") val userAdded: AuditLogUserAdded? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.updated")
    @get:JsonProperty("user.updated") val userUpdated: AuditLogUserUpdated? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.deleted")
    @get:JsonProperty("user.deleted") val userDeleted: AuditLogUserDeleted? = null
) {

}

