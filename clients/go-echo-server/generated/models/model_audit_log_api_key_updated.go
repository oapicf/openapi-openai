package models

// AuditLogApiKeyUpdated - The details for events with this `type`.
type AuditLogApiKeyUpdated struct {

	// The tracking ID of the API key.
	Id string `json:"id,omitempty"`

	ChangesRequested AuditLogApiKeyUpdatedChangesRequested `json:"changes_requested,omitempty"`
}
