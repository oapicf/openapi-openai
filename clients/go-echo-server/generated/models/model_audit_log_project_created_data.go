package models

// AuditLogProjectCreatedData - The payload used to create the project.
type AuditLogProjectCreatedData struct {

	// The project name.
	Name string `json:"name,omitempty"`

	// The title of the project as seen on the dashboard.
	Title string `json:"title,omitempty"`
}
