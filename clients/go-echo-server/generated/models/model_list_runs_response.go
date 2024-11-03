package models

type ListRunsResponse struct {

	Object string `json:"object"`

	Data []RunObject `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
