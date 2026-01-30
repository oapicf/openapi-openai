package models

type InviteRequest struct {

	// Send an email to this address
	Email string `json:"email"`

	// `owner` or `reader`
	Role string `json:"role"`

	// An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
	Projects []InviteRequestProjectsInner `json:"projects,omitempty"`
}
