package models

// RunStepStreamEventOneOf1 - Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.
type RunStepStreamEventOneOf1 struct {

	Event string `json:"event"`

	Data RunStepObject `json:"data"`
}
