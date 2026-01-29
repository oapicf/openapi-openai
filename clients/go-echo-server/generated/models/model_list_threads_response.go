package models

type ListThreadsResponse struct {

	Object string `json:"object"`

	Data []ThreadObject `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
