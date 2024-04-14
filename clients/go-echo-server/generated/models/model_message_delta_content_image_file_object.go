package models

// MessageDeltaContentImageFileObject - References an image [File](/docs/api-reference/files) in the content of a message.
type MessageDeltaContentImageFileObject struct {

	// The index of the content part in the message.
	Index int32 `json:"index"`

	// Always `image_file`.
	Type string `json:"type"`

	ImageFile MessageDeltaContentImageFileObjectImageFile `json:"image_file,omitempty"`
}
