package models

// AuditLogProjectCreated - The details for events with this `type`.
type AuditLogProjectCreated struct {

	// The project ID.
	Id string `json:"id,omitempty"`

	Data AuditLogProjectCreatedData `json:"data,omitempty"`
}
