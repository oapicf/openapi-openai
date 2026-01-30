package models

// MessageDeltaObjectDelta - The delta containing the fields that have changed on the Message.
type MessageDeltaObjectDelta struct {

	// The entity that produced the message. One of `user` or `assistant`.
	Role string `json:"role,omitempty"`

	// The content of the message in array of text and/or images.
	Content []MessageDeltaObjectDeltaContentInner `json:"content,omitempty"`
}
