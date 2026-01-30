package models

// RunStepStreamEventOneOf2 - Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
type RunStepStreamEventOneOf2 struct {

	Event string `json:"event"`

	Data RunStepDeltaObject `json:"data"`
}
