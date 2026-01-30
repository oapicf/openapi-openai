goog.provide('API.Client.AuditLog_rate_limit_updated');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogRateLimitUpdated = function() {}

/**
 * The rate limit ID
 * @type {!string}
 * @export
 */
API.Client.AuditLogRateLimitUpdated.prototype.id;

/**
 * @type {!API.Client.AuditLog_rate_limit_updated_changes_requested}
 * @export
 */
API.Client.AuditLogRateLimitUpdated.prototype.changesRequested;

