package models

type ListModelsResponse struct {

	Object string `json:"object"`

	Data []Model `json:"data"`
}
