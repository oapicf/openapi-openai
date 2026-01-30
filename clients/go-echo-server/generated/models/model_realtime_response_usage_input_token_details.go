package models

// RealtimeResponseUsageInputTokenDetails - Details about the input tokens used in the Response.
type RealtimeResponseUsageInputTokenDetails struct {

	// The number of cached tokens used in the Response.
	CachedTokens int32 `json:"cached_tokens,omitempty"`

	// The number of text tokens used in the Response.
	TextTokens int32 `json:"text_tokens,omitempty"`

	// The number of audio tokens used in the Response.
	AudioTokens int32 `json:"audio_tokens,omitempty"`
}
