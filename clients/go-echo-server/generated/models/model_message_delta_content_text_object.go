package models

// MessageDeltaContentTextObject - The text content that is part of a message.
type MessageDeltaContentTextObject struct {

	// The index of the content part in the message.
	Index int32 `json:"index"`

	// Always `text`.
	Type string `json:"type"`

	Text MessageDeltaContentTextObjectText `json:"text,omitempty"`
}
