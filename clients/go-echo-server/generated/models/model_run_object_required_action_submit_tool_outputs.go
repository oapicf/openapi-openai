package models

// RunObjectRequiredActionSubmitToolOutputs - Details on the tool outputs needed for this run to continue.
type RunObjectRequiredActionSubmitToolOutputs struct {

	// A list of the relevant tool calls.
	ToolCalls []RunToolCallObject `json:"tool_calls"`
}
