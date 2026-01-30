package models

// AuditLogUserUpdated - The details for events with this `type`.
type AuditLogUserUpdated struct {

	// The project ID.
	Id string `json:"id,omitempty"`

	ChangesRequested AuditLogUserUpdatedChangesRequested `json:"changes_requested,omitempty"`
}
