package models

// CreateChatCompletionStreamResponseUsage - An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
type CreateChatCompletionStreamResponseUsage struct {

	// Number of tokens in the generated completion.
	CompletionTokens int32 `json:"completion_tokens"`

	// Number of tokens in the prompt.
	PromptTokens int32 `json:"prompt_tokens"`

	// Total number of tokens used in the request (prompt + completion).
	TotalTokens int32 `json:"total_tokens"`
}
