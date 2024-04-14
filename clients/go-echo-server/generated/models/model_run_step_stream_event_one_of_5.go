package models

// RunStepStreamEventOneOf5 - Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
type RunStepStreamEventOneOf5 struct {

	Event string `json:"event"`

	Data RunStepObject `json:"data"`
}
