package models

// MessageContentTextObject - The text content that is part of a message.
type MessageContentTextObject struct {

	// Always `text`.
	Type string `json:"type"`

	Text MessageContentTextObjectText `json:"text"`
}
