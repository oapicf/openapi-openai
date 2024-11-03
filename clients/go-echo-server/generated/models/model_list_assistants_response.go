package models

type ListAssistantsResponse struct {

	Object string `json:"object"`

	Data []AssistantObject `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
