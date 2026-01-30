package models

type UserListResponse struct {

	Object string `json:"object"`

	Data []User `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}
