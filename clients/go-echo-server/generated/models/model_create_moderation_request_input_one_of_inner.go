package models

type CreateModerationRequestInputOneOfInner struct {

	// Always `image_url`.
	Type string `json:"type"`

	ImageUrl CreateModerationRequestInputOneOfInnerOneOfImageUrl `json:"image_url"`

	// A string of text to classify.
	Text string `json:"text"`
}
