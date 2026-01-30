package models

// ProjectServiceAccount - Represents an individual service account in a project.
type ProjectServiceAccount struct {

	// The object type, which is always `organization.project.service_account`
	Object string `json:"object"`

	// The identifier, which can be referenced in API endpoints
	Id string `json:"id"`

	// The name of the service account
	Name string `json:"name"`

	// `owner` or `member`
	Role string `json:"role"`

	// The Unix timestamp (in seconds) of when the service account was created
	CreatedAt int32 `json:"created_at"`
}
