package models

// AuditLogApiKeyUpdatedChangesRequested - The payload used to update the API key.
type AuditLogApiKeyUpdatedChangesRequested struct {

	// A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
	Scopes []string `json:"scopes,omitempty"`
}
