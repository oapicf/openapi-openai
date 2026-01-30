package models

type ListFilesResponse struct {

	Object string `json:"object"`

	Data []OpenAiFile `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
