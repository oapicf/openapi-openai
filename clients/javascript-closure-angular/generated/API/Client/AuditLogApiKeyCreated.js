goog.provide('API.Client.AuditLog_api_key_created');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogApiKeyCreated = function() {}

/**
 * The tracking ID of the API key.
 * @type {!string}
 * @export
 */
API.Client.AuditLogApiKeyCreated.prototype.id;

/**
 * @type {!API.Client.AuditLog_api_key_created_data}
 * @export
 */
API.Client.AuditLogApiKeyCreated.prototype.data;

