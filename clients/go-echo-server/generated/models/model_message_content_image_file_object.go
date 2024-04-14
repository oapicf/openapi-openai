package models

// MessageContentImageFileObject - References an image [File](/docs/api-reference/files) in the content of a message.
type MessageContentImageFileObject struct {

	// Always `image_file`.
	Type string `json:"type"`

	ImageFile MessageContentImageFileObjectImageFile `json:"image_file"`
}
