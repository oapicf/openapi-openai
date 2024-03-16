package models

type CreateCompletionResponseUsage struct {

	PromptTokens int32 `json:"prompt_tokens"`

	CompletionTokens int32 `json:"completion_tokens"`

	TotalTokens int32 `json:"total_tokens"`
}
