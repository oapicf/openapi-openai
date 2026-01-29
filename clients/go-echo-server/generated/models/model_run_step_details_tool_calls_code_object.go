package models

// RunStepDetailsToolCallsCodeObject - Details of the Code Interpreter tool call the run step was involved in.
type RunStepDetailsToolCallsCodeObject struct {

	// The ID of the tool call.
	Id string `json:"id"`

	// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
	Type string `json:"type"`

	CodeInterpreter RunStepDetailsToolCallsCodeObjectCodeInterpreter `json:"code_interpreter"`
}
