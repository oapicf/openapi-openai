package models

// RunStepStreamEventOneOf3 - Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
type RunStepStreamEventOneOf3 struct {

	Event string `json:"event"`

	Data RunStepObject `json:"data"`
}
