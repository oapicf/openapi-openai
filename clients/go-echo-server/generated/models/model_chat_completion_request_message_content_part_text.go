package models

// ChatCompletionRequestMessageContentPartText - Learn about [text inputs](/docs/guides/text-generation). 
type ChatCompletionRequestMessageContentPartText struct {

	// The type of the content part.
	Type string `json:"type"`

	// The text content.
	Text string `json:"text"`
}
