goog.provide('API.Client.AuditLog_user_added');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogUserAdded = function() {}

/**
 * The user ID.
 * @type {!string}
 * @export
 */
API.Client.AuditLogUserAdded.prototype.id;

/**
 * @type {!API.Client.AuditLog_user_added_data}
 * @export
 */
API.Client.AuditLogUserAdded.prototype.data;

