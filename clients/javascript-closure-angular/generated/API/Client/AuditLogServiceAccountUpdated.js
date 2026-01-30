goog.provide('API.Client.AuditLog_service_account_updated');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogServiceAccountUpdated = function() {}

/**
 * The service account ID.
 * @type {!string}
 * @export
 */
API.Client.AuditLogServiceAccountUpdated.prototype.id;

/**
 * @type {!API.Client.AuditLog_service_account_updated_changes_requested}
 * @export
 */
API.Client.AuditLogServiceAccountUpdated.prototype.changesRequested;

