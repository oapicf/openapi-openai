package models

// ProjectUser - Represents an individual user in a project.
type ProjectUser struct {

	// The object type, which is always `organization.project.user`
	Object string `json:"object"`

	// The identifier, which can be referenced in API endpoints
	Id string `json:"id"`

	// The name of the user
	Name string `json:"name"`

	// The email address of the user
	Email string `json:"email"`

	// `owner` or `member`
	Role string `json:"role"`

	// The Unix timestamp (in seconds) of when the project was added.
	AddedAt int32 `json:"added_at"`
}
