package models

type ListFineTuneEventsResponse struct {

	Object string `json:"object"`

	Data []FineTuneEvent `json:"data"`
}
