package models

// CreateTranscriptionResponseVerboseJson - Represents a verbose json transcription response returned by model, based on the provided input.
type CreateTranscriptionResponseVerboseJson struct {

	// The language of the input audio.
	Language string `json:"language"`

	// The duration of the input audio.
	Duration string `json:"duration"`

	// The transcribed text.
	Text string `json:"text"`

	// Extracted words and their corresponding timestamps.
	Words []TranscriptionWord `json:"words,omitempty"`

	// Segments of the transcribed text and their corresponding details.
	Segments []TranscriptionSegment `json:"segments,omitempty"`
}
