package models

// AuditLogInviteSentData - The payload used to create the invite.
type AuditLogInviteSentData struct {

	// The email invited to the organization.
	Email string `json:"email,omitempty"`

	// The role the email was invited to be. Is either `owner` or `member`.
	Role string `json:"role,omitempty"`
}
