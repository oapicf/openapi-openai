package models

// RunStreamEventOneOf1 - Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
type RunStreamEventOneOf1 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
