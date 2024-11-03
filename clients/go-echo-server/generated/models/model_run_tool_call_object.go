package models

// RunToolCallObject - Tool call objects
type RunToolCallObject struct {

	// The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
	Id string `json:"id"`

	// The type of tool call the output is required for. For now, this is always `function`.
	Type string `json:"type"`

	Function RunToolCallObjectFunction `json:"function"`
}
