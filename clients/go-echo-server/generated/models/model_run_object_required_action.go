package models

// RunObjectRequiredAction - Details on the action required to continue the run. Will be `null` if no action is required.
type RunObjectRequiredAction struct {

	// For now, this is always `submit_tool_outputs`.
	Type string `json:"type"`

	SubmitToolOutputs RunObjectRequiredActionSubmitToolOutputs `json:"submit_tool_outputs"`
}
