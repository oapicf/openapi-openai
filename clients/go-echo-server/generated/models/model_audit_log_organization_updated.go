package models

// AuditLogOrganizationUpdated - The details for events with this `type`.
type AuditLogOrganizationUpdated struct {

	// The organization ID.
	Id string `json:"id,omitempty"`

	ChangesRequested AuditLogOrganizationUpdatedChangesRequested `json:"changes_requested,omitempty"`
}
