goog.provide('API.Client.AuditLog_project');

/**
 * The project that the action was scoped to. Absent for actions not scoped to projects.
 * @record
 */
API.Client.AuditLogProject = function() {}

/**
 * The project ID.
 * @type {!string}
 * @export
 */
API.Client.AuditLogProject.prototype.id;

/**
 * The project title.
 * @type {!string}
 * @export
 */
API.Client.AuditLogProject.prototype.name;

