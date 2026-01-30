package models

// AuditLogApiKeyCreated - The details for events with this `type`.
type AuditLogApiKeyCreated struct {

	// The tracking ID of the API key.
	Id string `json:"id,omitempty"`

	Data AuditLogApiKeyCreatedData `json:"data,omitempty"`
}
