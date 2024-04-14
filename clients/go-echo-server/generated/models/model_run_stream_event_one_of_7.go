package models

// RunStreamEventOneOf7 - Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
type RunStreamEventOneOf7 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
