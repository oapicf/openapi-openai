package models

// CompletionUsagePromptTokensDetails - Breakdown of tokens used in the prompt.
type CompletionUsagePromptTokensDetails struct {

	// Audio input tokens present in the prompt.
	AudioTokens int32 `json:"audio_tokens,omitempty"`

	// Cached tokens present in the prompt.
	CachedTokens int32 `json:"cached_tokens,omitempty"`
}
