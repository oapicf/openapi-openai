package models

// Invite - Represents an individual `invite` to the organization.
type Invite struct {

	// The object type, which is always `organization.invite`
	Object string `json:"object"`

	// The identifier, which can be referenced in API endpoints
	Id string `json:"id"`

	// The email address of the individual to whom the invite was sent
	Email string `json:"email"`

	// `owner` or `reader`
	Role string `json:"role"`

	// `accepted`,`expired`, or `pending`
	Status string `json:"status"`

	// The Unix timestamp (in seconds) of when the invite was sent.
	InvitedAt int32 `json:"invited_at"`

	// The Unix timestamp (in seconds) of when the invite expires.
	ExpiresAt int32 `json:"expires_at"`

	// The Unix timestamp (in seconds) of when the invite was accepted.
	AcceptedAt int32 `json:"accepted_at,omitempty"`

	// The projects that were granted membership upon acceptance of the invite.
	Projects []InviteProjectsInner `json:"projects,omitempty"`
}
