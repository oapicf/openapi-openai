package models

// MessageStreamEventOneOf4 - Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
type MessageStreamEventOneOf4 struct {

	Event string `json:"event"`

	Data MessageObject `json:"data"`
}
