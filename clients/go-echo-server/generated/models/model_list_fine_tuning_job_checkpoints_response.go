package models

type ListFineTuningJobCheckpointsResponse struct {

	Data []FineTuningJobCheckpoint `json:"data"`

	Object string `json:"object"`

	FirstId *string `json:"first_id,omitempty"`

	LastId *string `json:"last_id,omitempty"`

	HasMore bool `json:"has_more"`
}
