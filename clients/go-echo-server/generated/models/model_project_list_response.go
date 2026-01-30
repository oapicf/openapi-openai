package models

type ProjectListResponse struct {

	Object string `json:"object"`

	Data []Project `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
