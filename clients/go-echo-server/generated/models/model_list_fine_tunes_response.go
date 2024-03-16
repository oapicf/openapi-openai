package models

type ListFineTunesResponse struct {

	Object string `json:"object"`

	Data []FineTune `json:"data"`
}
