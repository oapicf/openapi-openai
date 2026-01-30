package models

// RunStepDeltaStepDetailsToolCallsObject - Details of the tool call.
type RunStepDeltaStepDetailsToolCallsObject struct {

	// Always `tool_calls`.
	Type string `json:"type"`

	// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
	ToolCalls []RunStepDeltaStepDetailsToolCallsObjectToolCallsInner `json:"tool_calls,omitempty"`
}
