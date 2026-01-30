package models

type MessageDeltaContentImageUrlObjectImageUrl struct {

	// The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
	Url string `json:"url,omitempty"`

	// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
	Detail string `json:"detail,omitempty"`
}
