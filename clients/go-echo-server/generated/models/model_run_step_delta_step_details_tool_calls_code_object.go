package models

// RunStepDeltaStepDetailsToolCallsCodeObject - Details of the Code Interpreter tool call the run step was involved in.
type RunStepDeltaStepDetailsToolCallsCodeObject struct {

	// The index of the tool call in the tool calls array.
	Index int32 `json:"index"`

	// The ID of the tool call.
	Id string `json:"id,omitempty"`

	// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
	Type string `json:"type"`

	CodeInterpreter RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter `json:"code_interpreter,omitempty"`
}
