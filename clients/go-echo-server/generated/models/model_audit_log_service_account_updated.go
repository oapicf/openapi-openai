package models

// AuditLogServiceAccountUpdated - The details for events with this `type`.
type AuditLogServiceAccountUpdated struct {

	// The service account ID.
	Id string `json:"id,omitempty"`

	ChangesRequested AuditLogServiceAccountUpdatedChangesRequested `json:"changes_requested,omitempty"`
}
