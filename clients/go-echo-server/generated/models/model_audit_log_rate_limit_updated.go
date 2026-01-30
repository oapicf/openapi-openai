package models

// AuditLogRateLimitUpdated - The details for events with this `type`.
type AuditLogRateLimitUpdated struct {

	// The rate limit ID
	Id string `json:"id,omitempty"`

	ChangesRequested AuditLogRateLimitUpdatedChangesRequested `json:"changes_requested,omitempty"`
}
