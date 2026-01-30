package models

// AuditLogUserAddedData - The payload used to add the user to the project.
type AuditLogUserAddedData struct {

	// The role of the user. Is either `owner` or `member`.
	Role string `json:"role,omitempty"`
}
