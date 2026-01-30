package models

// AuditLogApiKeyCreatedData - The payload used to create the API key.
type AuditLogApiKeyCreatedData struct {

	// A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
	Scopes []string `json:"scopes,omitempty"`
}
