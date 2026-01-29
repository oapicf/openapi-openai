package models

type CreateTranslationResponseVerboseJson struct {

	// The language of the output translation (always `english`).
	Language string `json:"language"`

	// The duration of the input audio.
	Duration string `json:"duration"`

	// The translated text.
	Text string `json:"text"`

	// Segments of the translated text and their corresponding details.
	Segments []TranscriptionSegment `json:"segments,omitempty"`
}
