package models

// CreateModerationRequestInputOneOfInnerOneOf1 - An object describing text to classify.
type CreateModerationRequestInputOneOfInnerOneOf1 struct {

	// Always `text`.
	Type string `json:"type"`

	// A string of text to classify.
	Text string `json:"text"`
}
