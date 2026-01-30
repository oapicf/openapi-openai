package models

// AuditLogUserUpdatedChangesRequested - The payload used to update the user.
type AuditLogUserUpdatedChangesRequested struct {

	// The role of the user. Is either `owner` or `member`.
	Role string `json:"role,omitempty"`
}
