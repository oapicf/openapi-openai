package models

// RunCompletionUsage - Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
type RunCompletionUsage struct {

	// Number of completion tokens used over the course of the run.
	CompletionTokens int32 `json:"completion_tokens"`

	// Number of prompt tokens used over the course of the run.
	PromptTokens int32 `json:"prompt_tokens"`

	// Total number of tokens used (prompt + completion).
	TotalTokens int32 `json:"total_tokens"`
}
