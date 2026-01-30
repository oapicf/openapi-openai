package models

// MessageContentImageUrlObject - References an image URL in the content of a message.
type MessageContentImageUrlObject struct {

	// The type of the content part.
	Type string `json:"type"`

	ImageUrl MessageContentImageUrlObjectImageUrl `json:"image_url"`
}
