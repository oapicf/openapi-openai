package models

// RealtimeResponseUsageOutputTokenDetails - Details about the output tokens used in the Response.
type RealtimeResponseUsageOutputTokenDetails struct {

	// The number of text tokens used in the Response.
	TextTokens int32 `json:"text_tokens,omitempty"`

	// The number of audio tokens used in the Response.
	AudioTokens int32 `json:"audio_tokens,omitempty"`
}
