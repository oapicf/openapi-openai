package models

type ProjectRateLimitListResponse struct {

	Object string `json:"object"`

	Data []ProjectRateLimit `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
