goog.provide('API.Client.AuditLog');

/**
 * A log of a user action or configuration change within this organization.
 * @record
 */
API.Client.AuditLog = function() {}

/**
 * The ID of this log.
 * @type {!string}
 * @export
 */
API.Client.AuditLog.prototype.id;

/**
 * @type {!API.Client.AuditLogEventType}
 * @export
 */
API.Client.AuditLog.prototype.type;

/**
 * The Unix timestamp (in seconds) of the event.
 * @type {!number}
 * @export
 */
API.Client.AuditLog.prototype.effectiveAt;

/**
 * @type {!API.Client.AuditLog_project}
 * @export
 */
API.Client.AuditLog.prototype.project;

/**
 * @type {!API.Client.AuditLogActor}
 * @export
 */
API.Client.AuditLog.prototype.actor;

/**
 * @type {!API.Client.AuditLog_api_key_created}
 * @export
 */
API.Client.AuditLog.prototype.apiKeyCreated;

/**
 * @type {!API.Client.AuditLog_api_key_updated}
 * @export
 */
API.Client.AuditLog.prototype.apiKeyUpdated;

/**
 * @type {!API.Client.AuditLog_api_key_deleted}
 * @export
 */
API.Client.AuditLog.prototype.apiKeyDeleted;

/**
 * @type {!API.Client.AuditLog_invite_sent}
 * @export
 */
API.Client.AuditLog.prototype.inviteSent;

/**
 * @type {!API.Client.AuditLog_invite_accepted}
 * @export
 */
API.Client.AuditLog.prototype.inviteAccepted;

/**
 * @type {!API.Client.AuditLog_invite_accepted}
 * @export
 */
API.Client.AuditLog.prototype.inviteDeleted;

/**
 * @type {!API.Client.AuditLog_login_failed}
 * @export
 */
API.Client.AuditLog.prototype.loginFailed;

/**
 * @type {!API.Client.AuditLog_login_failed}
 * @export
 */
API.Client.AuditLog.prototype.logoutFailed;

/**
 * @type {!API.Client.AuditLog_organization_updated}
 * @export
 */
API.Client.AuditLog.prototype.organizationUpdated;

/**
 * @type {!API.Client.AuditLog_project_created}
 * @export
 */
API.Client.AuditLog.prototype.projectCreated;

/**
 * @type {!API.Client.AuditLog_project_updated}
 * @export
 */
API.Client.AuditLog.prototype.projectUpdated;

/**
 * @type {!API.Client.AuditLog_project_archived}
 * @export
 */
API.Client.AuditLog.prototype.projectArchived;

/**
 * @type {!API.Client.AuditLog_rate_limit_updated}
 * @export
 */
API.Client.AuditLog.prototype.rateLimitUpdated;

/**
 * @type {!API.Client.AuditLog_rate_limit_deleted}
 * @export
 */
API.Client.AuditLog.prototype.rateLimitDeleted;

/**
 * @type {!API.Client.AuditLog_service_account_created}
 * @export
 */
API.Client.AuditLog.prototype.serviceAccountCreated;

/**
 * @type {!API.Client.AuditLog_service_account_updated}
 * @export
 */
API.Client.AuditLog.prototype.serviceAccountUpdated;

/**
 * @type {!API.Client.AuditLog_service_account_deleted}
 * @export
 */
API.Client.AuditLog.prototype.serviceAccountDeleted;

/**
 * @type {!API.Client.AuditLog_user_added}
 * @export
 */
API.Client.AuditLog.prototype.userAdded;

/**
 * @type {!API.Client.AuditLog_user_updated}
 * @export
 */
API.Client.AuditLog.prototype.userUpdated;

/**
 * @type {!API.Client.AuditLog_user_deleted}
 * @export
 */
API.Client.AuditLog.prototype.userDeleted;

