package models

// AuditLogOrganizationUpdatedChangesRequested - The payload used to update the organization settings.
type AuditLogOrganizationUpdatedChangesRequested struct {

	// The organization title.
	Title string `json:"title,omitempty"`

	// The organization description.
	Description string `json:"description,omitempty"`

	// The organization name.
	Name string `json:"name,omitempty"`

	Settings AuditLogOrganizationUpdatedChangesRequestedSettings `json:"settings,omitempty"`
}
