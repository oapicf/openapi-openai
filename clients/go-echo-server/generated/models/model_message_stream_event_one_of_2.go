package models

// MessageStreamEventOneOf2 - Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
type MessageStreamEventOneOf2 struct {

	Event string `json:"event"`

	Data MessageDeltaObject `json:"data"`
}
