goog.provide('API.Client.AuditLog_user_updated');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogUserUpdated = function() {}

/**
 * The project ID.
 * @type {!string}
 * @export
 */
API.Client.AuditLogUserUpdated.prototype.id;

/**
 * @type {!API.Client.AuditLog_user_updated_changes_requested}
 * @export
 */
API.Client.AuditLogUserUpdated.prototype.changesRequested;

