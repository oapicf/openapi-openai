package models

type ProjectApiKeyListResponse struct {

	Object string `json:"object"`

	Data []ProjectApiKey `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
