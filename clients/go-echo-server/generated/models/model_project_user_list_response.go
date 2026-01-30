package models

type ProjectUserListResponse struct {

	Object string `json:"object"`

	Data []ProjectUser `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
