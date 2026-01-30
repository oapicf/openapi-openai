package models

type ApiKeyList struct {

	Object string `json:"object,omitempty"`

	Data []AdminApiKey `json:"data,omitempty"`

	HasMore bool `json:"has_more,omitempty"`

	FirstId string `json:"first_id,omitempty"`

	LastId string `json:"last_id,omitempty"`
}
