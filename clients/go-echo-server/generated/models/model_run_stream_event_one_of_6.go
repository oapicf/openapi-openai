package models

// RunStreamEventOneOf6 - Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
type RunStreamEventOneOf6 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
