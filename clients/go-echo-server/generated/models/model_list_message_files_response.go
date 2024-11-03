package models

type ListMessageFilesResponse struct {

	Object string `json:"object"`

	Data []MessageFileObject `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
