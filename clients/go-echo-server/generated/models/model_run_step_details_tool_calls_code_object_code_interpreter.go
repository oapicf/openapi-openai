package models

// RunStepDetailsToolCallsCodeObjectCodeInterpreter - The Code Interpreter tool call definition.
type RunStepDetailsToolCallsCodeObjectCodeInterpreter struct {

	// The input to the Code Interpreter tool call.
	Input string `json:"input"`

	// The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
	Outputs []RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner `json:"outputs"`
}
