package models

// RunStreamEventOneOf4 - Occurs when a [run](/docs/api-reference/runs/object) is completed.
type RunStreamEventOneOf4 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
