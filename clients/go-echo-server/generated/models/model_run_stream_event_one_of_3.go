package models

// RunStreamEventOneOf3 - Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
type RunStreamEventOneOf3 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
