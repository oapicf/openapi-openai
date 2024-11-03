package models

import (
	"gopkg.in/validator.v2"
)

type ChatCompletionRequestMessageContentPart struct {

	// The type of the content part.
	Type string `json:"type"`

	// The text content.
	Text string `json:"text"`

	ImageUrl ChatCompletionRequestMessageContentPartImageImageUrl `json:"image_url"`
}
