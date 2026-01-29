package models

// CreateEmbeddingResponseUsage - The usage information for the request.
type CreateEmbeddingResponseUsage struct {

	// The number of tokens used by the prompt.
	PromptTokens int32 `json:"prompt_tokens"`

	// The total number of tokens used by the request.
	TotalTokens int32 `json:"total_tokens"`
}
