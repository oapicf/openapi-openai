package models

type DeleteVectorStoreResponse struct {

	Id string `json:"id"`

	Deleted bool `json:"deleted"`

	Object string `json:"object"`
}
