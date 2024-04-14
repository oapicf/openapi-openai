package models

// CompletionUsage - Usage statistics for the completion request.
type CompletionUsage struct {

	// Number of tokens in the generated completion.
	CompletionTokens int32 `json:"completion_tokens"`

	// Number of tokens in the prompt.
	PromptTokens int32 `json:"prompt_tokens"`

	// Total number of tokens used in the request (prompt + completion).
	TotalTokens int32 `json:"total_tokens"`
}
