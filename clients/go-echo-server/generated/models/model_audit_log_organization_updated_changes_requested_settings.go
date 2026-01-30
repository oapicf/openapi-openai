package models

type AuditLogOrganizationUpdatedChangesRequestedSettings struct {

	// Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
	ThreadsUiVisibility string `json:"threads_ui_visibility,omitempty"`

	// Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
	UsageDashboardVisibility string `json:"usage_dashboard_visibility,omitempty"`
}
