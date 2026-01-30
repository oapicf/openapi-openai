package models

// AuditLogActorSession - The session in which the audit logged action was performed.
type AuditLogActorSession struct {

	User AuditLogActorUser `json:"user,omitempty"`

	// The IP address from which the action was performed.
	IpAddress string `json:"ip_address,omitempty"`
}
