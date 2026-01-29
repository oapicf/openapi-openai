package models

// RunStepStreamEventOneOf4 - Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
type RunStepStreamEventOneOf4 struct {

	Event string `json:"event"`

	Data RunStepObject `json:"data"`
}
