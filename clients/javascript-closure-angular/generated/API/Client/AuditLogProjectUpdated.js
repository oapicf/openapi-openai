goog.provide('API.Client.AuditLog_project_updated');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogProjectUpdated = function() {}

/**
 * The project ID.
 * @type {!string}
 * @export
 */
API.Client.AuditLogProjectUpdated.prototype.id;

/**
 * @type {!API.Client.AuditLog_project_updated_changes_requested}
 * @export
 */
API.Client.AuditLogProjectUpdated.prototype.changesRequested;

