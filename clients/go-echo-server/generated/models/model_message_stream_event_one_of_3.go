package models

// MessageStreamEventOneOf3 - Occurs when a [message](/docs/api-reference/messages/object) is completed.
type MessageStreamEventOneOf3 struct {

	Event string `json:"event"`

	Data MessageObject `json:"data"`
}
