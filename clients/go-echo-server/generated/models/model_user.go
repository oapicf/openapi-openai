package models

// User - Represents an individual `user` within an organization.
type User struct {

	// The object type, which is always `organization.user`
	Object string `json:"object"`

	// The identifier, which can be referenced in API endpoints
	Id string `json:"id"`

	// The name of the user
	Name string `json:"name"`

	// The email address of the user
	Email string `json:"email"`

	// `owner` or `reader`
	Role string `json:"role"`

	// The Unix timestamp (in seconds) of when the user was added.
	AddedAt int32 `json:"added_at"`
}
