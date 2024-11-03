package models

// RunStepStreamEventOneOf - Occurs when a [run step](/docs/api-reference/runs/step-object) is created.
type RunStepStreamEventOneOf struct {

	Event string `json:"event"`

	Data RunStepObject `json:"data"`
}
