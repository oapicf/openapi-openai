goog.provide('API.Client.AuditLog_api_key_updated_changes_requested');

/**
 * The payload used to update the API key.
 * @record
 */
API.Client.AuditLogApiKeyUpdatedChangesRequested = function() {}

/**
 * A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
 * @type {!Array<!string>}
 * @export
 */
API.Client.AuditLogApiKeyUpdatedChangesRequested.prototype.scopes;

