package models

type CreateEmbeddingResponseUsage struct {

	PromptTokens int32 `json:"prompt_tokens"`

	TotalTokens int32 `json:"total_tokens"`
}
