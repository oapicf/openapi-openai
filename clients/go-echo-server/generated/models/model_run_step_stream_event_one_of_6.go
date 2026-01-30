package models

// RunStepStreamEventOneOf6 - Occurs when a [run step](/docs/api-reference/run-steps/step-object) expires.
type RunStepStreamEventOneOf6 struct {

	Event string `json:"event"`

	Data RunStepObject `json:"data"`
}
