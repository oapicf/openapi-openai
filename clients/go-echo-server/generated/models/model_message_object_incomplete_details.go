package models

// MessageObjectIncompleteDetails - On an incomplete message, details about why the message is incomplete.
type MessageObjectIncompleteDetails struct {

	// The reason the message is incomplete.
	Reason string `json:"reason"`
}
