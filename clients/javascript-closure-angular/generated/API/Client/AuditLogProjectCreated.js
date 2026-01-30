goog.provide('API.Client.AuditLog_project_created');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogProjectCreated = function() {}

/**
 * The project ID.
 * @type {!string}
 * @export
 */
API.Client.AuditLogProjectCreated.prototype.id;

/**
 * @type {!API.Client.AuditLog_project_created_data}
 * @export
 */
API.Client.AuditLogProjectCreated.prototype.data;

