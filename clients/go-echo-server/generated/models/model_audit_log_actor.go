package models

// AuditLogActor - The actor who performed the audit logged action.
type AuditLogActor struct {

	// The type of actor. Is either `session` or `api_key`.
	Type string `json:"type,omitempty"`

	Session AuditLogActorSession `json:"session,omitempty"`

	ApiKey AuditLogActorApiKey `json:"api_key,omitempty"`
}
