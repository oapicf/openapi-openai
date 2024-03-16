package models

type DeleteModelResponse struct {

	Id string `json:"id"`

	Object string `json:"object"`

	Deleted bool `json:"deleted"`
}
