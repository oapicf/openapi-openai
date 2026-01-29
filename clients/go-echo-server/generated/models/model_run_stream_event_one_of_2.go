package models

// RunStreamEventOneOf2 - Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
type RunStreamEventOneOf2 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
