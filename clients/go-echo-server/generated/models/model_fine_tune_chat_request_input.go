package models

// FineTuneChatRequestInput - The per-line training example of a fine-tuning input file for chat models using the supervised method.
type FineTuneChatRequestInput struct {

	Messages []FineTuneChatRequestInputMessagesInner `json:"messages,omitempty"`

	// A list of tools the model may generate JSON inputs for.
	Tools []ChatCompletionTool `json:"tools,omitempty"`

	// Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
	ParallelToolCalls bool `json:"parallel_tool_calls,omitempty"`

	// A list of functions the model may generate JSON inputs for.
	// Deprecated
	Functions []ChatCompletionFunctions `json:"functions,omitempty"`
}
