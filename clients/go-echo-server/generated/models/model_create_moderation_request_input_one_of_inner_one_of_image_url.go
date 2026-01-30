package models

// CreateModerationRequestInputOneOfInnerOneOfImageUrl - Contains either an image URL or a data URL for a base64 encoded image.
type CreateModerationRequestInputOneOfInnerOneOfImageUrl struct {

	// Either a URL of the image or the base64 encoded image data.
	Url string `json:"url"`
}
