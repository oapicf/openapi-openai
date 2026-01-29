package models

// RunStreamEventOneOf5 - Occurs when a [run](/docs/api-reference/runs/object) fails.
type RunStreamEventOneOf5 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
