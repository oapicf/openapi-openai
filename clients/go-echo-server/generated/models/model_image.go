package models

// Image - Represents the url or the content of an image generated by the OpenAI API.
type Image struct {

	// The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
	B64Json string `json:"b64_json,omitempty"`

	// The URL of the generated image, if `response_format` is `url` (default).
	Url string `json:"url,omitempty"`

	// The prompt that was used to generate the image, if there was any revision to the prompt.
	RevisedPrompt string `json:"revised_prompt,omitempty"`
}
