package models

// AuditLogServiceAccountUpdatedChangesRequested - The payload used to updated the service account.
type AuditLogServiceAccountUpdatedChangesRequested struct {

	// The role of the service account. Is either `owner` or `member`.
	Role string `json:"role,omitempty"`
}
