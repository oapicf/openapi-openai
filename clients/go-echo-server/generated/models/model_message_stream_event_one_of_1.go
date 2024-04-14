package models

// MessageStreamEventOneOf1 - Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
type MessageStreamEventOneOf1 struct {

	Event string `json:"event"`

	Data MessageObject `json:"data"`
}
