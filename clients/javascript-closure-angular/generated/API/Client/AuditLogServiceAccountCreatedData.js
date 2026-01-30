goog.provide('API.Client.AuditLog_service_account_created_data');

/**
 * The payload used to create the service account.
 * @record
 */
API.Client.AuditLogServiceAccountCreatedData = function() {}

/**
 * The role of the service account. Is either `owner` or `member`.
 * @type {!string}
 * @export
 */
API.Client.AuditLogServiceAccountCreatedData.prototype.role;

