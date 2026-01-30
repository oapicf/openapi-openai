package models

type UserDeleteResponse struct {

	Object string `json:"object"`

	Id string `json:"id"`

	Deleted bool `json:"deleted"`
}
