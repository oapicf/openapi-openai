package models

// RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject - Text output from the Code Interpreter tool call as part of a run step.
type RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject struct {

	// The index of the output in the outputs array.
	Index int32 `json:"index"`

	// Always `logs`.
	Type string `json:"type"`

	// The text output from the Code Interpreter tool call.
	Logs string `json:"logs,omitempty"`
}
