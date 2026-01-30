package models

// MessageDeltaContentImageUrlObject - References an image URL in the content of a message.
type MessageDeltaContentImageUrlObject struct {

	// The index of the content part in the message.
	Index int32 `json:"index"`

	// Always `image_url`.
	Type string `json:"type"`

	ImageUrl MessageDeltaContentImageUrlObjectImageUrl `json:"image_url,omitempty"`
}
