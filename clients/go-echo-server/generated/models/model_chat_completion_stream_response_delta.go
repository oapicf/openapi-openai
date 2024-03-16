package models

type ChatCompletionStreamResponseDelta struct {

	// The role of the author of this message.
	Role string `json:"role,omitempty"`

	// The contents of the chunk message.
	Content *string `json:"content,omitempty"`

	FunctionCall ChatCompletionRequestMessageFunctionCall `json:"function_call,omitempty"`
}
