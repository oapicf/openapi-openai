package models

// AssistantsApiNamedToolChoice - Specifies a tool the model should use. Use to force the model to call a specific tool.
type AssistantsApiNamedToolChoice struct {

	// The type of the tool. If type is `function`, the function name must be set
	Type string `json:"type"`

	Function ChatCompletionNamedToolChoiceFunction `json:"function,omitempty"`
}
