package models

// AuditLogActorApiKey - The API Key used to perform the audit logged action.
type AuditLogActorApiKey struct {

	// The tracking id of the API key.
	Id string `json:"id,omitempty"`

	// The type of API key. Can be either `user` or `service_account`.
	Type string `json:"type,omitempty"`

	User AuditLogActorUser `json:"user,omitempty"`

	ServiceAccount AuditLogActorServiceAccount `json:"service_account,omitempty"`
}
