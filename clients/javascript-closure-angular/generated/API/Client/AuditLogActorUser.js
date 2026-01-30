goog.provide('API.Client.AuditLogActorUser');

/**
 * The user who performed the audit logged action.
 * @record
 */
API.Client.AuditLogActorUser = function() {}

/**
 * The user id.
 * @type {!string}
 * @export
 */
API.Client.AuditLogActorUser.prototype.id;

/**
 * The user email.
 * @type {!string}
 * @export
 */
API.Client.AuditLogActorUser.prototype.email;

