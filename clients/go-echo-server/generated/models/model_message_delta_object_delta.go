package models

// MessageDeltaObjectDelta - The delta containing the fields that have changed on the Message.
type MessageDeltaObjectDelta struct {

	// The entity that produced the message. One of `user` or `assistant`.
	Role string `json:"role,omitempty"`

	// The content of the message in array of text and/or images.
	Content []MessageDeltaObjectDeltaContentInner `json:"content,omitempty"`

	// A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
	FileIds []string `json:"file_ids,omitempty"`
}
