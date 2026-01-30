goog.provide('API.Client.AuditLog_service_account_updated_changes_requested');

/**
 * The payload used to updated the service account.
 * @record
 */
API.Client.AuditLogServiceAccountUpdatedChangesRequested = function() {}

/**
 * The role of the service account. Is either `owner` or `member`.
 * @type {!string}
 * @export
 */
API.Client.AuditLogServiceAccountUpdatedChangesRequested.prototype.role;

