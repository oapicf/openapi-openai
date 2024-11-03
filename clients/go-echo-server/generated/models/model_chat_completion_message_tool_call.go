package models

type ChatCompletionMessageToolCall struct {

	// The ID of the tool call.
	Id string `json:"id"`

	// The type of the tool. Currently, only `function` is supported.
	Type string `json:"type"`

	Function ChatCompletionMessageToolCallFunction `json:"function"`
}
