package models

type ChatCompletionRequestMessageContentPartImageImageUrl struct {

	// Either a URL of the image or the base64 encoded image data.
	Url string `json:"url"`

	// Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
	Detail string `json:"detail,omitempty"`
}
