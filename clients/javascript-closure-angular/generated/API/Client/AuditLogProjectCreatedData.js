goog.provide('API.Client.AuditLog_project_created_data');

/**
 * The payload used to create the project.
 * @record
 */
API.Client.AuditLogProjectCreatedData = function() {}

/**
 * The project name.
 * @type {!string}
 * @export
 */
API.Client.AuditLogProjectCreatedData.prototype.name;

/**
 * The title of the project as seen on the dashboard.
 * @type {!string}
 * @export
 */
API.Client.AuditLogProjectCreatedData.prototype.title;

