package models

type ChatCompletionRequestMessageContentPartImage struct {

	// The type of the content part.
	Type string `json:"type"`

	ImageUrl ChatCompletionRequestMessageContentPartImageImageUrl `json:"image_url"`
}
