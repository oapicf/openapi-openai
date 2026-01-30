goog.provide('API.Client.AuditLog_user_updated_changes_requested');

/**
 * The payload used to update the user.
 * @record
 */
API.Client.AuditLogUserUpdatedChangesRequested = function() {}

/**
 * The role of the user. Is either `owner` or `member`.
 * @type {!string}
 * @export
 */
API.Client.AuditLogUserUpdatedChangesRequested.prototype.role;

