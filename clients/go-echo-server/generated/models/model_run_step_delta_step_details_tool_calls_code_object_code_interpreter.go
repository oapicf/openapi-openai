package models

// RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter - The Code Interpreter tool call definition.
type RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter struct {

	// The input to the Code Interpreter tool call.
	Input string `json:"input,omitempty"`

	// The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
	Outputs []RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner `json:"outputs,omitempty"`
}
