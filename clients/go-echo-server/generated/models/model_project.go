package models

// Project - Represents an individual project.
type Project struct {

	// The identifier, which can be referenced in API endpoints
	Id string `json:"id"`

	// The object type, which is always `organization.project`
	Object string `json:"object"`

	// The name of the project. This appears in reporting.
	Name string `json:"name"`

	// The Unix timestamp (in seconds) of when the project was created.
	CreatedAt int32 `json:"created_at"`

	// The Unix timestamp (in seconds) of when the project was archived or `null`.
	ArchivedAt *int32 `json:"archived_at,omitempty"`

	// `active` or `archived`
	Status string `json:"status"`
}
