package models

// AuditLogUserAdded - The details for events with this `type`.
type AuditLogUserAdded struct {

	// The user ID.
	Id string `json:"id,omitempty"`

	Data AuditLogUserAddedData `json:"data,omitempty"`
}
