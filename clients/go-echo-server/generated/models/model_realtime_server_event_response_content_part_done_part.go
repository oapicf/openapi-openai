package models

// RealtimeServerEventResponseContentPartDonePart - The content part that is done.
type RealtimeServerEventResponseContentPartDonePart struct {

	// The content type (\"text\", \"audio\").
	Type string `json:"type,omitempty"`

	// The text content (if type is \"text\").
	Text string `json:"text,omitempty"`

	// Base64-encoded audio data (if type is \"audio\").
	Audio string `json:"audio,omitempty"`

	// The transcript of the audio (if type is \"audio\").
	Transcript string `json:"transcript,omitempty"`
}
