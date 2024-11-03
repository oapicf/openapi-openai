package models

// MessageStreamEventOneOf - Occurs when a [message](/docs/api-reference/messages/object) is created.
type MessageStreamEventOneOf struct {

	Event string `json:"event"`

	Data MessageObject `json:"data"`
}
