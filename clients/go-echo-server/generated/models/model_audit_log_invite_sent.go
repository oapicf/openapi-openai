package models

// AuditLogInviteSent - The details for events with this `type`.
type AuditLogInviteSent struct {

	// The ID of the invite.
	Id string `json:"id,omitempty"`

	Data AuditLogInviteSentData `json:"data,omitempty"`
}
