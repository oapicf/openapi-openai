
package org.openapitools.client.model


case class AuditLog (
    /* The ID of this log. */
    _id: String,
    _type: AuditLogEventType,
    /* The Unix timestamp (in seconds) of the event. */
    _effectiveAt: Integer,
    _project: Option[AuditLogProject],
    _actor: AuditLogActor,
    _apiKeyCreated: Option[AuditLogApiKeyCreated],
    _apiKeyUpdated: Option[AuditLogApiKeyUpdated],
    _apiKeyDeleted: Option[AuditLogApiKeyDeleted],
    _inviteSent: Option[AuditLogInviteSent],
    _inviteAccepted: Option[AuditLogInviteAccepted],
    _inviteDeleted: Option[AuditLogInviteAccepted],
    _loginFailed: Option[AuditLogLoginFailed],
    _logoutFailed: Option[AuditLogLoginFailed],
    _organizationUpdated: Option[AuditLogOrganizationUpdated],
    _projectCreated: Option[AuditLogProjectCreated],
    _projectUpdated: Option[AuditLogProjectUpdated],
    _projectArchived: Option[AuditLogProjectArchived],
    _rateLimitUpdated: Option[AuditLogRateLimitUpdated],
    _rateLimitDeleted: Option[AuditLogRateLimitDeleted],
    _serviceAccountCreated: Option[AuditLogServiceAccountCreated],
    _serviceAccountUpdated: Option[AuditLogServiceAccountUpdated],
    _serviceAccountDeleted: Option[AuditLogServiceAccountDeleted],
    _userAdded: Option[AuditLogUserAdded],
    _userUpdated: Option[AuditLogUserUpdated],
    _userDeleted: Option[AuditLogUserDeleted]
)
object AuditLog {
    def toStringBody(var_id: Object, var_type: Object, var_effectiveAt: Object, var_project: Object, var_actor: Object, var_apiKeyCreated: Object, var_apiKeyUpdated: Object, var_apiKeyDeleted: Object, var_inviteSent: Object, var_inviteAccepted: Object, var_inviteDeleted: Object, var_loginFailed: Object, var_logoutFailed: Object, var_organizationUpdated: Object, var_projectCreated: Object, var_projectUpdated: Object, var_projectArchived: Object, var_rateLimitUpdated: Object, var_rateLimitDeleted: Object, var_serviceAccountCreated: Object, var_serviceAccountUpdated: Object, var_serviceAccountDeleted: Object, var_userAdded: Object, var_userUpdated: Object, var_userDeleted: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"effectiveAt":$var_effectiveAt,"project":$var_project,"actor":$var_actor,"apiKeyCreated":$var_apiKeyCreated,"apiKeyUpdated":$var_apiKeyUpdated,"apiKeyDeleted":$var_apiKeyDeleted,"inviteSent":$var_inviteSent,"inviteAccepted":$var_inviteAccepted,"inviteDeleted":$var_inviteDeleted,"loginFailed":$var_loginFailed,"logoutFailed":$var_logoutFailed,"organizationUpdated":$var_organizationUpdated,"projectCreated":$var_projectCreated,"projectUpdated":$var_projectUpdated,"projectArchived":$var_projectArchived,"rateLimitUpdated":$var_rateLimitUpdated,"rateLimitDeleted":$var_rateLimitDeleted,"serviceAccountCreated":$var_serviceAccountCreated,"serviceAccountUpdated":$var_serviceAccountUpdated,"serviceAccountDeleted":$var_serviceAccountDeleted,"userAdded":$var_userAdded,"userUpdated":$var_userUpdated,"userDeleted":$var_userDeleted
        | }
        """.stripMargin
}
