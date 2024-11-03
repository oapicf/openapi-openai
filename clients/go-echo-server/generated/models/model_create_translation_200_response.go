package models

import (
	"gopkg.in/validator.v2"
)

type CreateTranslation200Response struct {

	// The translated text.
	Text string `json:"text"`

	// The language of the output translation (always `english`).
	Language string `json:"language"`

	// The duration of the input audio.
	Duration string `json:"duration"`

	// Segments of the translated text and their corresponding details.
	Segments []TranscriptionSegment `json:"segments,omitempty"`
}
