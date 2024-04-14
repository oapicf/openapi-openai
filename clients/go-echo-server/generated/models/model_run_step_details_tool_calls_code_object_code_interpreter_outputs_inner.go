package models

type RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner struct {

	// Always `logs`.
	Type string `json:"type"`

	// The text output from the Code Interpreter tool call.
	Logs string `json:"logs"`

	Image RunStepDetailsToolCallsCodeOutputImageObjectImage `json:"image"`
}
