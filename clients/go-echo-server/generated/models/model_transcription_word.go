package models

type TranscriptionWord struct {

	// The text content of the word.
	Word string `json:"word"`

	// Start time of the word in seconds.
	Start float32 `json:"start"`

	// End time of the word in seconds.
	End float32 `json:"end"`
}
