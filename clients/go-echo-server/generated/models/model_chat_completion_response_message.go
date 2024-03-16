package models

type ChatCompletionResponseMessage struct {

	// The role of the author of this message.
	Role string `json:"role"`

	// The contents of the message.
	Content *string `json:"content,omitempty"`

	FunctionCall ChatCompletionRequestMessageFunctionCall `json:"function_call,omitempty"`
}
