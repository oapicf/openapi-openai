goog.provide('API.Client.AuditLog_login_failed');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogLoginFailed = function() {}

/**
 * The error code of the failure.
 * @type {!string}
 * @export
 */
API.Client.AuditLogLoginFailed.prototype.errorCode;

/**
 * The error message of the failure.
 * @type {!string}
 * @export
 */
API.Client.AuditLogLoginFailed.prototype.errorMessage;

