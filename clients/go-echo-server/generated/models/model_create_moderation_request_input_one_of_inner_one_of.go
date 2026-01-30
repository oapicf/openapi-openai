package models

// CreateModerationRequestInputOneOfInnerOneOf - An object describing an image to classify.
type CreateModerationRequestInputOneOfInnerOneOf struct {

	// Always `image_url`.
	Type string `json:"type"`

	ImageUrl CreateModerationRequestInputOneOfInnerOneOfImageUrl `json:"image_url"`
}
