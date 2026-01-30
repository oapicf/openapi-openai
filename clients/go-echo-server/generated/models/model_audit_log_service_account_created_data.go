package models

// AuditLogServiceAccountCreatedData - The payload used to create the service account.
type AuditLogServiceAccountCreatedData struct {

	// The role of the service account. Is either `owner` or `member`.
	Role string `json:"role,omitempty"`
}
