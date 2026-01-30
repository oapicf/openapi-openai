package models

// MessageRequestContentTextObject - The text content that is part of a message.
type MessageRequestContentTextObject struct {

	// Always `text`.
	Type string `json:"type"`

	// Text content to be sent to the model
	Text string `json:"text"`
}
