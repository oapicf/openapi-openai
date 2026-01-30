package models

type ListBatchesResponse struct {

	Data []Batch `json:"data"`

	FirstId string `json:"first_id,omitempty"`

	LastId string `json:"last_id,omitempty"`

	HasMore bool `json:"has_more"`

	Object string `json:"object"`
}
