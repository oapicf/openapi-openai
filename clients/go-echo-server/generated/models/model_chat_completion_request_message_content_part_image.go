package models

// ChatCompletionRequestMessageContentPartImage - Learn about [image inputs](/docs/guides/vision). 
type ChatCompletionRequestMessageContentPartImage struct {

	// The type of the content part.
	Type string `json:"type"`

	ImageUrl ChatCompletionRequestMessageContentPartImageImageUrl `json:"image_url"`
}
