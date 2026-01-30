package models

// AuditLogProjectUpdated - The details for events with this `type`.
type AuditLogProjectUpdated struct {

	// The project ID.
	Id string `json:"id,omitempty"`

	ChangesRequested AuditLogProjectUpdatedChangesRequested `json:"changes_requested,omitempty"`
}
