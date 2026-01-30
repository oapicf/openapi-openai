package models

type ListAuditLogsResponse struct {

	Object string `json:"object"`

	Data []AuditLog `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
