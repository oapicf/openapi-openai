package models

type ListVectorStoresResponse struct {

	Object string `json:"object"`

	Data []VectorStoreObject `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
