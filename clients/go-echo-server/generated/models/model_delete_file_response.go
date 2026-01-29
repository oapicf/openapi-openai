package models

type DeleteFileResponse struct {

	Id string `json:"id"`

	Object string `json:"object"`

	Deleted bool `json:"deleted"`
}
