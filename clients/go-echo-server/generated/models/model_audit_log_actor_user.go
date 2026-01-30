package models

// AuditLogActorUser - The user who performed the audit logged action.
type AuditLogActorUser struct {

	// The user id.
	Id string `json:"id,omitempty"`

	// The user email.
	Email string `json:"email,omitempty"`
}
