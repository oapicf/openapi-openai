package models

// AuditLogLoginFailed - The details for events with this `type`.
type AuditLogLoginFailed struct {

	// The error code of the failure.
	ErrorCode string `json:"error_code,omitempty"`

	// The error message of the failure.
	ErrorMessage string `json:"error_message,omitempty"`
}
