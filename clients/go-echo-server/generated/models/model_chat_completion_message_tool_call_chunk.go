package models

type ChatCompletionMessageToolCallChunk struct {

	Index int32 `json:"index"`

	// The ID of the tool call.
	Id string `json:"id,omitempty"`

	// The type of the tool. Currently, only `function` is supported.
	Type string `json:"type,omitempty"`

	Function ChatCompletionMessageToolCallChunkFunction `json:"function,omitempty"`
}
