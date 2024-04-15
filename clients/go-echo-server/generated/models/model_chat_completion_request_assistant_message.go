package models

type ChatCompletionRequestAssistantMessage struct {

	// The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
	Content *string `json:"content,omitempty"`

	// The role of the messages author, in this case `assistant`.
	Role string `json:"role"`

	// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	Name string `json:"name,omitempty"`

	// The tool calls generated by the model, such as function calls.
	ToolCalls []ChatCompletionMessageToolCall `json:"tool_calls,omitempty"`

	// Deprecated
	FunctionCall ChatCompletionRequestAssistantMessageFunctionCall `json:"function_call,omitempty"`
}