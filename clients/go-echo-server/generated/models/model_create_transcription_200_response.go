package models

type CreateTranscription200Response struct {

	// The transcribed text.
	Text string `json:"text"`

	// The language of the input audio.
	Language string `json:"language"`

	// The duration of the input audio.
	Duration string `json:"duration"`

	// Extracted words and their corresponding timestamps.
	Words []TranscriptionWord `json:"words,omitempty"`

	// Segments of the transcribed text and their corresponding details.
	Segments []TranscriptionSegment `json:"segments,omitempty"`
}
