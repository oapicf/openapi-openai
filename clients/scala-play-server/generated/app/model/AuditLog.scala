package model

import play.api.libs.json._

/**
  * A log of a user action or configuration change within this organization.
  * @param id The ID of this log.
  * @param effectiveAt The Unix timestamp (in seconds) of the event.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLog(
  id: String,
  `type`: AuditLogEventType,
  effectiveAt: Int,
  project: Option[AuditLogProject],
  actor: AuditLogActor,
  apiKeyCreated: Option[AuditLogApiKeyCreated],
  apiKeyUpdated: Option[AuditLogApiKeyUpdated],
  apiKeyDeleted: Option[AuditLogApiKeyDeleted],
  inviteSent: Option[AuditLogInviteSent],
  inviteAccepted: Option[AuditLogInviteAccepted],
  inviteDeleted: Option[AuditLogInviteAccepted],
  loginFailed: Option[AuditLogLoginFailed],
  logoutFailed: Option[AuditLogLoginFailed],
  organizationUpdated: Option[AuditLogOrganizationUpdated],
  projectCreated: Option[AuditLogProjectCreated],
  projectUpdated: Option[AuditLogProjectUpdated],
  projectArchived: Option[AuditLogProjectArchived],
  rateLimitUpdated: Option[AuditLogRateLimitUpdated],
  rateLimitDeleted: Option[AuditLogRateLimitDeleted],
  serviceAccountCreated: Option[AuditLogServiceAccountCreated],
  serviceAccountUpdated: Option[AuditLogServiceAccountUpdated],
  serviceAccountDeleted: Option[AuditLogServiceAccountDeleted],
  userAdded: Option[AuditLogUserAdded],
  userUpdated: Option[AuditLogUserUpdated],
  userDeleted: Option[AuditLogUserDeleted]
)

object AuditLog {
  implicit lazy val auditLogJsonFormat: Format[AuditLog] = Json.format[AuditLog]
}

