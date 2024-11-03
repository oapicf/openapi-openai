package models

type ChatCompletionRequestMessageContentPartText struct {

	// The type of the content part.
	Type string `json:"type"`

	// The text content.
	Text string `json:"text"`
}
