package models

// AuditLogProject - The project that the action was scoped to. Absent for actions not scoped to projects.
type AuditLogProject struct {

	// The project ID.
	Id string `json:"id,omitempty"`

	// The project title.
	Name string `json:"name,omitempty"`
}
