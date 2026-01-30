goog.provide('API.Client.AuditLog_user_added_data');

/**
 * The payload used to add the user to the project.
 * @record
 */
API.Client.AuditLogUserAddedData = function() {}

/**
 * The role of the user. Is either `owner` or `member`.
 * @type {!string}
 * @export
 */
API.Client.AuditLogUserAddedData.prototype.role;

