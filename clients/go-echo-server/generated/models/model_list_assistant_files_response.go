package models

type ListAssistantFilesResponse struct {

	Object string `json:"object"`

	Data []AssistantFileObject `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
