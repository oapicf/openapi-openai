package models

// MessageDeltaContentRefusalObject - The refusal content that is part of a message.
type MessageDeltaContentRefusalObject struct {

	// The index of the refusal part in the message.
	Index int32 `json:"index"`

	// Always `refusal`.
	Type string `json:"type"`

	Refusal string `json:"refusal,omitempty"`
}
