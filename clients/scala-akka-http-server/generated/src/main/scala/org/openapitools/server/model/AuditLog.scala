package org.openapitools.server.model


/**
 * A log of a user action or configuration change within this organization.
 *
 * @param id The ID of this log. for example: ''null''
 * @param `type`  for example: ''null''
 * @param effectiveAt The Unix timestamp (in seconds) of the event. for example: ''null''
 * @param project  for example: ''null''
 * @param actor  for example: ''null''
 * @param apiKeyCreated  for example: ''null''
 * @param apiKeyUpdated  for example: ''null''
 * @param apiKeyDeleted  for example: ''null''
 * @param inviteSent  for example: ''null''
 * @param inviteAccepted  for example: ''null''
 * @param inviteDeleted  for example: ''null''
 * @param loginFailed  for example: ''null''
 * @param logoutFailed  for example: ''null''
 * @param organizationUpdated  for example: ''null''
 * @param projectCreated  for example: ''null''
 * @param projectUpdated  for example: ''null''
 * @param projectArchived  for example: ''null''
 * @param rateLimitUpdated  for example: ''null''
 * @param rateLimitDeleted  for example: ''null''
 * @param serviceAccountCreated  for example: ''null''
 * @param serviceAccountUpdated  for example: ''null''
 * @param serviceAccountDeleted  for example: ''null''
 * @param userAdded  for example: ''null''
 * @param userUpdated  for example: ''null''
 * @param userDeleted  for example: ''null''
*/
final case class AuditLog (
  id: String,
  `type`: AuditLogEventType,
  effectiveAt: Int,
  project: Option[AuditLogProject] = None,
  actor: AuditLogActor,
  apiKeyCreated: Option[AuditLogApiKeyCreated] = None,
  apiKeyUpdated: Option[AuditLogApiKeyUpdated] = None,
  apiKeyDeleted: Option[AuditLogApiKeyDeleted] = None,
  inviteSent: Option[AuditLogInviteSent] = None,
  inviteAccepted: Option[AuditLogInviteAccepted] = None,
  inviteDeleted: Option[AuditLogInviteAccepted] = None,
  loginFailed: Option[AuditLogLoginFailed] = None,
  logoutFailed: Option[AuditLogLoginFailed] = None,
  organizationUpdated: Option[AuditLogOrganizationUpdated] = None,
  projectCreated: Option[AuditLogProjectCreated] = None,
  projectUpdated: Option[AuditLogProjectUpdated] = None,
  projectArchived: Option[AuditLogProjectArchived] = None,
  rateLimitUpdated: Option[AuditLogRateLimitUpdated] = None,
  rateLimitDeleted: Option[AuditLogRateLimitDeleted] = None,
  serviceAccountCreated: Option[AuditLogServiceAccountCreated] = None,
  serviceAccountUpdated: Option[AuditLogServiceAccountUpdated] = None,
  serviceAccountDeleted: Option[AuditLogServiceAccountDeleted] = None,
  userAdded: Option[AuditLogUserAdded] = None,
  userUpdated: Option[AuditLogUserUpdated] = None,
  userDeleted: Option[AuditLogUserDeleted] = None
)

