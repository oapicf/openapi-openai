package models

type Model struct {

	Id string `json:"id"`

	Object string `json:"object"`

	Created int32 `json:"created"`

	OwnedBy string `json:"owned_by"`
}
