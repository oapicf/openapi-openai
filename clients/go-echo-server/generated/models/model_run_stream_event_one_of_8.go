package models

// RunStreamEventOneOf8 - Occurs when a [run](/docs/api-reference/runs/object) expires.
type RunStreamEventOneOf8 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
