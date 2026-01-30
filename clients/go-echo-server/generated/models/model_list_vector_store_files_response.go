package models

type ListVectorStoreFilesResponse struct {

	Object string `json:"object"`

	Data []VectorStoreFileObject `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
