package models

type ChatCompletionTool struct {

	// The type of the tool. Currently, only `function` is supported.
	Type string `json:"type"`

	Function FunctionObject `json:"function"`
}
