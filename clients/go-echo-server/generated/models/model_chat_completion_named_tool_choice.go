package models

// ChatCompletionNamedToolChoice - Specifies a tool the model should use. Use to force the model to call a specific function.
type ChatCompletionNamedToolChoice struct {

	// The type of the tool. Currently, only `function` is supported.
	Type string `json:"type"`

	Function ChatCompletionNamedToolChoiceFunction `json:"function"`
}
