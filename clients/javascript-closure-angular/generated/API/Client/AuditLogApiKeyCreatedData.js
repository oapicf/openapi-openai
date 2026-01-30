goog.provide('API.Client.AuditLog_api_key_created_data');

/**
 * The payload used to create the API key.
 * @record
 */
API.Client.AuditLogApiKeyCreatedData = function() {}

/**
 * A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
 * @type {!Array<!string>}
 * @export
 */
API.Client.AuditLogApiKeyCreatedData.prototype.scopes;

