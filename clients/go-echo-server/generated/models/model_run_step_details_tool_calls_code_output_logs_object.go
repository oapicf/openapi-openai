package models

// RunStepDetailsToolCallsCodeOutputLogsObject - Text output from the Code Interpreter tool call as part of a run step.
type RunStepDetailsToolCallsCodeOutputLogsObject struct {

	// Always `logs`.
	Type string `json:"type"`

	// The text output from the Code Interpreter tool call.
	Logs string `json:"logs"`
}
