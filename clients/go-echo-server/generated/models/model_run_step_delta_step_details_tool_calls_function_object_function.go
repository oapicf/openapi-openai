package models

// RunStepDeltaStepDetailsToolCallsFunctionObjectFunction - The definition of the function that was called.
type RunStepDeltaStepDetailsToolCallsFunctionObjectFunction struct {

	// The name of the function.
	Name string `json:"name,omitempty"`

	// The arguments passed to the function.
	Arguments string `json:"arguments,omitempty"`

	// The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
	Output *string `json:"output,omitempty"`
}
