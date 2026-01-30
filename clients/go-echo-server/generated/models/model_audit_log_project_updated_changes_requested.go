package models

// AuditLogProjectUpdatedChangesRequested - The payload used to update the project.
type AuditLogProjectUpdatedChangesRequested struct {

	// The title of the project as seen on the dashboard.
	Title string `json:"title,omitempty"`
}
