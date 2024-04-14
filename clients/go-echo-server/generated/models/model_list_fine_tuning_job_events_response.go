package models

type ListFineTuningJobEventsResponse struct {

	Data []FineTuningJobEvent `json:"data"`

	Object string `json:"object"`
}
