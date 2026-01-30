goog.provide('API.Client.AuditLogActorSession');

/**
 * The session in which the audit logged action was performed.
 * @record
 */
API.Client.AuditLogActorSession = function() {}

/**
 * @type {!API.Client.AuditLogActorUser}
 * @export
 */
API.Client.AuditLogActorSession.prototype.user;

/**
 * The IP address from which the action was performed.
 * @type {!string}
 * @export
 */
API.Client.AuditLogActorSession.prototype.ipAddress;

