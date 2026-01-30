package models

// RealtimeServerEventConversationItemInputAudioTranscriptionFailedError - Details of the transcription error.
type RealtimeServerEventConversationItemInputAudioTranscriptionFailedError struct {

	// The type of error.
	Type string `json:"type,omitempty"`

	// Error code, if any.
	Code string `json:"code,omitempty"`

	// A human-readable error message.
	Message string `json:"message,omitempty"`

	// Parameter related to the error, if any.
	Param string `json:"param,omitempty"`
}
