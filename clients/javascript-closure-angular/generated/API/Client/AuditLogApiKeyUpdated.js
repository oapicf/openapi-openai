goog.provide('API.Client.AuditLog_api_key_updated');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogApiKeyUpdated = function() {}

/**
 * The tracking ID of the API key.
 * @type {!string}
 * @export
 */
API.Client.AuditLogApiKeyUpdated.prototype.id;

/**
 * @type {!API.Client.AuditLog_api_key_updated_changes_requested}
 * @export
 */
API.Client.AuditLogApiKeyUpdated.prototype.changesRequested;

