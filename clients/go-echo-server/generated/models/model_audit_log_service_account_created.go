package models

// AuditLogServiceAccountCreated - The details for events with this `type`.
type AuditLogServiceAccountCreated struct {

	// The service account ID.
	Id string `json:"id,omitempty"`

	Data AuditLogServiceAccountCreatedData `json:"data,omitempty"`
}
